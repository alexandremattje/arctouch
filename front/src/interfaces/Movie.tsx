export interface MovieList {
    id: number;
    title: string;
    genres: string;
    poster_path: string;
    backdrop_path: string;
    release_date: string;
}

export interface MovieDetail {
    id: number;
    title: string;
    genres: string;
    poster_path: string;
    backdrop_path: string;
    release_date: string;
    overview: string;
}