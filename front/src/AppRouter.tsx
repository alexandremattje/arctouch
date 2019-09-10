import React from 'react';
import { BrowserRouter as Router, Route } from "react-router-dom";
import Movies from './pages/Movies';
import MovieDetail from './pages/MovieDetail';

const AppRouter = () => {
    return (
        <Router>
            <div>
                <Route path="/" exact component={Movies} />
                <Route path="/movie" component={MovieDetail} />
            </div>
        </Router>
    );
};

export default AppRouter;