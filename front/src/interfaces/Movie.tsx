export interface MovieList {
    id: number;
    title: String;
    genre_ids: Array<String>;
    poster_path: String;
    backdrop_path: String;
    release_date: String;
}

export interface MovieDetail {
    id: number;
    title: String;
    genres: Array<{ id: number, name: string }>;
    poster_path: String;
    backdrop_path: String;
    release_date: String;
}