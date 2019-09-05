export default interface Movie {
    id: number;
    title: String;
    genre_ids: Array<String>;
    poster_path: String;
    backdrop_path: String;
    release_date: String;
}