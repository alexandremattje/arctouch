import React from 'react'
import { useState, useEffect } from 'react'
import Table from '@material-ui/core/Table'
import TableBody from '@material-ui/core/TableBody'
import TableCell from '@material-ui/core/TableCell'
import TableHead from '@material-ui/core/TableHead'
import TableRow from '@material-ui/core/TableRow'

interface Movie {
    id: number
    name: String
    title: String
    idade: Number
    cidadeNatal?: String
}

export default () => {

    const [page, setPage] = useState(1)
    const [query, setQuery] = useState("")
    const [movies, setMovies] = useState(Array<Movie>())

    useEffect(() => {
        fetch(`/movie/query?query=${query}&page=${page}`).then(res => {
            res.json().then(json => {
                setPage(json.page)
                setMovies(json.results)
                console.log(json.results)
            });
        });
    }, []);

    return (
        <div>
            Movies
            <Table>
                <TableBody>
                    {movies.map(movie => (
                        <TableRow key={movie.id}>
                            <TableCell component="th" scope="row">
                                {movie.title}
                            </TableCell>
                        </TableRow>
                    ))}
                    
                </TableBody>
            </Table>
        </div>
    );

}