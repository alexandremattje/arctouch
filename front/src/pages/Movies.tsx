import React from "react";
import { useState, useEffect } from "react";
import TextField from "@material-ui/core/TextField";
import "./movies.css";
import Movie from "../interfaces/Movie";
import MovieCard from "./components/MovieCard";
import { Container, CircularProgress } from "@material-ui/core";
import { makeStyles, createStyles, Theme } from "@material-ui/core/styles";

const useStyles = makeStyles((theme: Theme) =>
  createStyles({
    fetchingMore: {
      ...theme.typography.button,
      backgroundColor: theme.palette.background.paper,
      padding: theme.spacing(5),
      width: "100%",
    },
    progress: {
        margin: theme.spacing(2),
    },    
  }),
);

export default () => {
    const [page, setPage] = useState(1);
    const [query, setQuery] = useState("");
    const [movies, setMovies] = useState(Array<Movie>());
    const [isFetching, setIsFetching] = useState(false);
    const classes = useStyles();

    useEffect(() => {
        fetchMoreListItems();
    }, [page]);

    useEffect(() => {
        setPage(1);
        fetchMoreListItems();
    }, [query]);

    useEffect(() => {
        window.addEventListener('scroll', handleScroll);
        return () => window.removeEventListener('scroll', handleScroll);
    }, []);

    useEffect(() => {
        if (isFetching) {
            setPage(page + 1);
        }
    }, [isFetching]);

    function handleScroll() {
        if (window.innerHeight + Math.round(document.documentElement.scrollTop) === document.documentElement.offsetHeight) {
            setIsFetching(true);
        }
    }

    function fetchMoreListItems() {
        fetch(`/movie/query?query=${query}&page=${page}`).then(res => {
            res.json().then(json => {
                setPage(json.page);
                setMovies(page === 1 ? json.results : movies => movies.concat(json.results));
                setIsFetching(false);
                console.log(json.results);
            });
        });
    }

    const handleOnChangeSearch = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement>) => {
        setQuery(e.target.value);
    }

    return (
        <Container maxWidth="sm" >
            <TextField variant="outlined" label="Search value" value={query} onChange={handleOnChangeSearch} fullWidth={true} />
            {movies ? movies.map(movie => (
                <MovieCard movie={movie} />
            )) : <></>}

            {isFetching ? <div> <CircularProgress className={classes.progress} /></div> : <div className={classes.fetchingMore}></div>}
        </Container>
    );
};
