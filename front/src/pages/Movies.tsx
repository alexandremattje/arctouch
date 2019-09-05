import React from "react";
import { useState, useEffect } from "react";
import TextField from "@material-ui/core/TextField";
import "./movies.css";
import Movie from "../interfaces/Movie";
import MovieCard from "./components/MovieCard";

export default () => {
    const [page, setPage] = useState(1);
    const [query, setQuery] = useState("");
    const [movies, setMovies] = useState(Array<Movie>());

    useEffect(() => {
        fetch(`/movie/query?query=${query}&page=${page}`).then(res => {
            res.json().then(json => {
                setPage(json.page);
                setMovies(json.results);
                console.log(json.results);
            });
        });
    }, [, query]);

    const handleOnChangeSearch = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement>) => {
        setQuery(e.target.value);
    }

    return (
        <div>
            <TextField variant="outlined" label="Search value" value={query} onChange={handleOnChangeSearch} />
            {movies.map(movie => (
                <MovieCard movie={movie} />
            ))}
        </div>
    );
};
