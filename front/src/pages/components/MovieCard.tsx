import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import { MovieList } from '../../interfaces/Movie';
import { withRouter, RouteComponentProps } from 'react-router';

const useStyles = makeStyles({
    card: {
        margin: 5,
    },
    media: {
        height: 281,
    },
});

interface MovieCardProps extends RouteComponentProps {
    movie: MovieList
}

const MovieCard = (props: MovieCardProps) => {
    const classes = useStyles({});

    const goToMovie = () => {
        props.history.push(`/movie?id=${props.movie.id}`);
    }

    const handleCardActionClick = () => {
        goToMovie()
    }

    const handleButtonDetailClick = () => {
        goToMovie()
    }

    return (
        <Card className={classes.card}>
            <CardActionArea onClick={handleCardActionClick}>
                <CardMedia
                    className={classes.media}
                    image={`https://image.tmdb.org/t/p/w500/${props.movie.backdrop_path}`}
                    title={`${props.movie.title}`}
                />
                <CardContent>
                    <Typography gutterBottom variant="h5" component="h2">
                        {props.movie.title}
                    </Typography>
                    <Typography variant="body2" color="textSecondary" component="p">
                        <strong>Genres:</strong>{props.movie.genres}
                    </Typography>
                    <Typography variant="body2" color="textSecondary" component="p">
                        <strong>Release date:</strong>{props.movie.release_date}
                    </Typography>
                </CardContent>
            </CardActionArea>
            <CardActions>
                <Button size="small" color="primary" onClick={handleButtonDetailClick}>
                    Detail
                </Button>
            </CardActions>
        </Card>
    );
}

export default withRouter(MovieCard)