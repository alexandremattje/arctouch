import React, { useEffect, useState } from 'react';
import { RouteComponentProps } from 'react-router-dom';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import { Grid, Paper } from '@material-ui/core';
import { makeStyles, createStyles, Theme } from "@material-ui/core/styles";
import { parse } from 'query-string';
import { MovieDetail } from '../interfaces/Movie';

const useStyles = makeStyles((theme: Theme) =>
    createStyles({
        root: {
            flexGrow: 1,
        },
        paper: {
            padding: theme.spacing(2),
            margin: 'auto',
            maxWidth: 960,
        },
        image: {
            height: 473,
            width: 315,
        },
        img: {
            margin: 'auto',
            display: 'block',
            maxWidth: '100%',
            maxHeight: '100%',
        },
    }),
);

interface MovieDetailProps extends RouteComponentProps {
}

export default (props: MovieDetailProps) => {
    const classes = useStyles({});
    const id = parse(props.location.search).id;
    const [movie, setMovie] = useState<MovieDetail | undefined>(undefined)

    useEffect(() => {
        fetchMovie();
    }, [])

    function fetchMovie() {
        fetch(`/movie/${id}`).then(res => {
            res.json().then(json => {
                console.log(json);
                setMovie(json);
            });
        });
    }

    const handleBackButtonClick = () => {
        props.history.goBack();
    }

    return (
        <>
            {movie ?
                <>
                    <div className={classes.root}>
                        <Paper className={classes.paper}>
                            <Button size="small" color="primary" onClick={handleBackButtonClick}>
                                Back
                            </Button>                        
                            <Grid container spacing={2}>
                                <Grid item>
                                    <CardMedia
                                        className={classes.image}
                                        image={`https://image.tmdb.org/t/p/w500/${movie.poster_path}`}
                                        title={`${movie.title}`}
                                    />
                                </Grid>
                                <Grid item xs={12} sm container>
                                    <Grid item xs container direction="column" spacing={5}>
                                        <Grid item xs>
                                            <Typography gutterBottom variant="h4">
                                                {movie.title}
                                            </Typography>
                                            <Typography variant="body2" gutterBottom>
                                                <strong>Genres: </strong>{movie.genres}
                                            </Typography>
                                            <Typography variant="body2" component="p">
                                                <strong>Overview: </strong>{movie.overview}
                                            </Typography>
                                            <Typography variant="body2" color="textSecondary" component="p">
                                                <strong>Release date: </strong>{movie.release_date}
                                            </Typography>
                                        </Grid>
                                    </Grid>
                                </Grid>
                            </Grid>
                        </Paper>
                    </div>
                </>
                :
                <></>
            }
        </>
    );

}