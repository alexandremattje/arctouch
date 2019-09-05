import React from "react";
import { useState, useEffect } from "react";
import "./movies.css";
import TextField from "@material-ui/core/TextField";

interface Movie {
    id: number;
    title: String;
    poster_path: String;
    backdrop_path: String;
}

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
    }, []);

    return (
        <div>
            <TextField variant="outlined" label="Search value" />
            {movies.map(movie => (
                <div className="container">
                    <div className="card container">
                        <div>{movie.title}</div>
                        <img
                            src={`https://image.tmdb.org/t/p/w500/${movie.backdrop_path}`}
                            alt="Poster"
                        ></img>
                    </div>
                </div>
            ))}
        </div>
    );
};
