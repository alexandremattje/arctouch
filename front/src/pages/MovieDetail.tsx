import React, { useEffect, useState } from 'react';
import { RouteComponentProps } from 'react-router-dom';
import { parse } from 'query-string';
import { MovieDetail } from '../interfaces/Movie';

interface MovieDetailProps extends RouteComponentProps {
}

export default (props: MovieDetailProps) => {
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

    return (
        <div>
            {movie ? movie.title : <></>}
            {movie ? movie.genres.map(genre => genre.name) : <></>}
        </div>
    );

}