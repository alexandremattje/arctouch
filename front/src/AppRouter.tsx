import React from 'react';
import {
    BrowserRouter as Router,
    Route
} from "react-router-dom";
import { QueryParamProvider } from 'use-query-params';
import Movies from './pages/Movies';
import MovieDetail from './pages/MovieDetail';


export default () => {
    return (
        <Router>
            <QueryParamProvider>
                <div>
                    <Route path="/" exact component={Movies} />
                    <Route path="/movie" component={MovieDetail} />
                </div>
            </QueryParamProvider>
        </Router>
    );
};
