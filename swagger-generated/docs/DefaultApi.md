# DefaultApi

All URIs are relative to *https://api.themoviedb.org/3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEAuthenticationSession**](DefaultApi.md#dELETEAuthenticationSession) | **DELETE** /authentication/session | Delete Session
[**dELETEListListId**](DefaultApi.md#dELETEListListId) | **DELETE** /list/{list_id} | Delete List
[**dELETEMovieMovieIdRating**](DefaultApi.md#dELETEMovieMovieIdRating) | **DELETE** /movie/{movie_id}/rating | Delete Rating
[**dELETETvTvIdRating**](DefaultApi.md#dELETETvTvIdRating) | **DELETE** /tv/{tv_id}/rating | Delete Rating
[**dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **DELETE** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Delete Rating
[**gETAccount**](DefaultApi.md#gETAccount) | **GET** /account | Get Details
[**gETAccountAccountIdFavoriteMovies**](DefaultApi.md#gETAccountAccountIdFavoriteMovies) | **GET** /account/{account_id}/favorite/movies | Get Favorite Movies
[**gETAccountAccountIdFavoriteTv**](DefaultApi.md#gETAccountAccountIdFavoriteTv) | **GET** /account/{account_id}/favorite/tv | Get Favorite TV Shows
[**gETAccountAccountIdLists**](DefaultApi.md#gETAccountAccountIdLists) | **GET** /account/{account_id}/lists | Get Created Lists
[**gETAccountAccountIdRatedMovies**](DefaultApi.md#gETAccountAccountIdRatedMovies) | **GET** /account/{account_id}/rated/movies | Get Rated Movies
[**gETAccountAccountIdRatedTv**](DefaultApi.md#gETAccountAccountIdRatedTv) | **GET** /account/{account_id}/rated/tv | Get Rated TV Shows
[**gETAccountAccountIdRatedTvEpisodes**](DefaultApi.md#gETAccountAccountIdRatedTvEpisodes) | **GET** /account/{account_id}/rated/tv/episodes | Get Rated TV Episodes
[**gETAccountAccountIdWatchlistMovies**](DefaultApi.md#gETAccountAccountIdWatchlistMovies) | **GET** /account/{account_id}/watchlist/movies | Get Movie Watchlist
[**gETAccountAccountIdWatchlistTv**](DefaultApi.md#gETAccountAccountIdWatchlistTv) | **GET** /account/{account_id}/watchlist/tv | Get TV Show Watchlist
[**gETAuthenticationGuestSessionNew**](DefaultApi.md#gETAuthenticationGuestSessionNew) | **GET** /authentication/guest_session/new | Create Guest Session
[**gETAuthenticationTokenNew**](DefaultApi.md#gETAuthenticationTokenNew) | **GET** /authentication/token/new | Create Request Token
[**gETCertificationMovieList**](DefaultApi.md#gETCertificationMovieList) | **GET** /certification/movie/list | Get Movie Certifications
[**gETCertificationTvList**](DefaultApi.md#gETCertificationTvList) | **GET** /certification/tv/list | Get TV Certifications
[**gETCollectionCollectionId**](DefaultApi.md#gETCollectionCollectionId) | **GET** /collection/{collection_id} | Get Details
[**gETCollectionCollectionIdImages**](DefaultApi.md#gETCollectionCollectionIdImages) | **GET** /collection/{collection_id}/images | Get Images
[**gETCollectionCollectionIdTranslations**](DefaultApi.md#gETCollectionCollectionIdTranslations) | **GET** /collection/{collection_id}/translations | Get Translations
[**gETCompanyCompanyId**](DefaultApi.md#gETCompanyCompanyId) | **GET** /company/{company_id} | Get Details
[**gETCompanyCompanyIdAlternativeNames**](DefaultApi.md#gETCompanyCompanyIdAlternativeNames) | **GET** /company/{company_id}/alternative_names | Get Alternative Names
[**gETCompanyCompanyIdImages**](DefaultApi.md#gETCompanyCompanyIdImages) | **GET** /company/{company_id}/images | Get Images
[**gETConfiguration**](DefaultApi.md#gETConfiguration) | **GET** /configuration | Get API Configuration
[**gETConfigurationCountries**](DefaultApi.md#gETConfigurationCountries) | **GET** /configuration/countries | Get Countries
[**gETConfigurationJobs**](DefaultApi.md#gETConfigurationJobs) | **GET** /configuration/jobs | Get Jobs
[**gETConfigurationLanguages**](DefaultApi.md#gETConfigurationLanguages) | **GET** /configuration/languages | Get Languages
[**gETConfigurationPrimaryTranslations**](DefaultApi.md#gETConfigurationPrimaryTranslations) | **GET** /configuration/primary_translations | Get Primary Translations
[**gETConfigurationTimezones**](DefaultApi.md#gETConfigurationTimezones) | **GET** /configuration/timezones | Get Timezones
[**gETCreditCreditId**](DefaultApi.md#gETCreditCreditId) | **GET** /credit/{credit_id} | Get Details
[**gETDiscoverMovie**](DefaultApi.md#gETDiscoverMovie) | **GET** /discover/movie | Movie Discover
[**gETDiscoverTv**](DefaultApi.md#gETDiscoverTv) | **GET** /discover/tv | TV Discover
[**gETFindExternalId**](DefaultApi.md#gETFindExternalId) | **GET** /find/{external_id} | Find by ID
[**gETGenreMovieList**](DefaultApi.md#gETGenreMovieList) | **GET** /genre/movie/list | Get Movie List
[**gETGenreTvList**](DefaultApi.md#gETGenreTvList) | **GET** /genre/tv/list | Get TV List
[**gETGuestSessionGuestSessionIdRatedMovies**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedMovies) | **GET** /guest_session/{guest_session_id}/rated/movies | Get Rated Movies
[**gETGuestSessionGuestSessionIdRatedTv**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTv) | **GET** /guest_session/{guest_session_id}/rated/tv | Get Rated TV Shows
[**gETGuestSessionGuestSessionIdRatedTvEpisodes**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTvEpisodes) | **GET** /guest_session/{guest_session_id}/rated/tv/episodes | Get Rated TV Episodes
[**gETKeywordKeywordId**](DefaultApi.md#gETKeywordKeywordId) | **GET** /keyword/{keyword_id} | Get Details
[**gETKeywordKeywordIdMovies**](DefaultApi.md#gETKeywordKeywordIdMovies) | **GET** /keyword/{keyword_id}/movies | Get Movies
[**gETListListId**](DefaultApi.md#gETListListId) | **GET** /list/{list_id} | Get Details
[**gETListListIdItemStatus**](DefaultApi.md#gETListListIdItemStatus) | **GET** /list/{list_id}/item_status | Check Item Status
[**gETMovieChanges**](DefaultApi.md#gETMovieChanges) | **GET** /movie/changes | Get Movie Change List
[**gETMovieLatest**](DefaultApi.md#gETMovieLatest) | **GET** /movie/latest | Get Latest
[**gETMovieMovieId**](DefaultApi.md#gETMovieMovieId) | **GET** /movie/{movie_id} | Get Details
[**gETMovieMovieIdAccountStates**](DefaultApi.md#gETMovieMovieIdAccountStates) | **GET** /movie/{movie_id}/account_states | Get Account States
[**gETMovieMovieIdAlternativeTitles**](DefaultApi.md#gETMovieMovieIdAlternativeTitles) | **GET** /movie/{movie_id}/alternative_titles | Get Alternative Titles
[**gETMovieMovieIdChanges**](DefaultApi.md#gETMovieMovieIdChanges) | **GET** /movie/{movie_id}/changes | Get Changes
[**gETMovieMovieIdCredits**](DefaultApi.md#gETMovieMovieIdCredits) | **GET** /movie/{movie_id}/credits | Get Credits
[**gETMovieMovieIdExternalIds**](DefaultApi.md#gETMovieMovieIdExternalIds) | **GET** /movie/{movie_id}/external_ids | Get External IDs
[**gETMovieMovieIdImages**](DefaultApi.md#gETMovieMovieIdImages) | **GET** /movie/{movie_id}/images | Get Images
[**gETMovieMovieIdKeywords**](DefaultApi.md#gETMovieMovieIdKeywords) | **GET** /movie/{movie_id}/keywords | Get Keywords
[**gETMovieMovieIdLists**](DefaultApi.md#gETMovieMovieIdLists) | **GET** /movie/{movie_id}/lists | Get Lists
[**gETMovieMovieIdRecommendations**](DefaultApi.md#gETMovieMovieIdRecommendations) | **GET** /movie/{movie_id}/recommendations | Get Recommendations
[**gETMovieMovieIdReleaseDates**](DefaultApi.md#gETMovieMovieIdReleaseDates) | **GET** /movie/{movie_id}/release_dates | Get Release Dates
[**gETMovieMovieIdReviews**](DefaultApi.md#gETMovieMovieIdReviews) | **GET** /movie/{movie_id}/reviews | Get Reviews
[**gETMovieMovieIdSimilar**](DefaultApi.md#gETMovieMovieIdSimilar) | **GET** /movie/{movie_id}/similar | Get Similar Movies
[**gETMovieMovieIdTranslations**](DefaultApi.md#gETMovieMovieIdTranslations) | **GET** /movie/{movie_id}/translations | Get Translations
[**gETMovieMovieIdVideos**](DefaultApi.md#gETMovieMovieIdVideos) | **GET** /movie/{movie_id}/videos | Get Videos
[**gETMovieNowPlaying**](DefaultApi.md#gETMovieNowPlaying) | **GET** /movie/now_playing | Get Now Playing
[**gETMoviePopular**](DefaultApi.md#gETMoviePopular) | **GET** /movie/popular | Get Popular
[**gETMovieTopRated**](DefaultApi.md#gETMovieTopRated) | **GET** /movie/top_rated | Get Top Rated
[**gETMovieUpcoming**](DefaultApi.md#gETMovieUpcoming) | **GET** /movie/upcoming | Get Upcoming
[**gETNetworkNetworkId**](DefaultApi.md#gETNetworkNetworkId) | **GET** /network/{network_id} | Get Details
[**gETNetworkNetworkIdAlternativeNames**](DefaultApi.md#gETNetworkNetworkIdAlternativeNames) | **GET** /network/{network_id}/alternative_names | Get Alternative Names
[**gETNetworkNetworkIdImages**](DefaultApi.md#gETNetworkNetworkIdImages) | **GET** /network/{network_id}/images | Get Images
[**gETPersonChanges**](DefaultApi.md#gETPersonChanges) | **GET** /person/changes | Get Person Change List
[**gETPersonLatest**](DefaultApi.md#gETPersonLatest) | **GET** /person/latest | Get Latest
[**gETPersonPersonId**](DefaultApi.md#gETPersonPersonId) | **GET** /person/{person_id} | Get Details
[**gETPersonPersonIdChanges**](DefaultApi.md#gETPersonPersonIdChanges) | **GET** /person/{person_id}/changes | Get Changes
[**gETPersonPersonIdCombinedCredits**](DefaultApi.md#gETPersonPersonIdCombinedCredits) | **GET** /person/{person_id}/combined_credits | Get Combined Credits
[**gETPersonPersonIdExternalIds**](DefaultApi.md#gETPersonPersonIdExternalIds) | **GET** /person/{person_id}/external_ids | Get External IDs
[**gETPersonPersonIdImages**](DefaultApi.md#gETPersonPersonIdImages) | **GET** /person/{person_id}/images | Get Images
[**gETPersonPersonIdMovieCredits**](DefaultApi.md#gETPersonPersonIdMovieCredits) | **GET** /person/{person_id}/movie_credits | Get Movie Credits
[**gETPersonPersonIdTaggedImages**](DefaultApi.md#gETPersonPersonIdTaggedImages) | **GET** /person/{person_id}/tagged_images | Get Tagged Images
[**gETPersonPersonIdTranslations**](DefaultApi.md#gETPersonPersonIdTranslations) | **GET** /person/{person_id}/translations | Get Translations
[**gETPersonPersonIdTvCredits**](DefaultApi.md#gETPersonPersonIdTvCredits) | **GET** /person/{person_id}/tv_credits | Get TV Credits
[**gETPersonPopular**](DefaultApi.md#gETPersonPopular) | **GET** /person/popular | Get Popular
[**gETReviewReviewId**](DefaultApi.md#gETReviewReviewId) | **GET** /review/{review_id} | Get Details
[**gETSearchCollection**](DefaultApi.md#gETSearchCollection) | **GET** /search/collection | Search Collections
[**gETSearchCompany**](DefaultApi.md#gETSearchCompany) | **GET** /search/company | Search Companies
[**gETSearchKeyword**](DefaultApi.md#gETSearchKeyword) | **GET** /search/keyword | Search Keywords
[**gETSearchMovie**](DefaultApi.md#gETSearchMovie) | **GET** /search/movie | Search Movies
[**gETSearchMulti**](DefaultApi.md#gETSearchMulti) | **GET** /search/multi | Multi Search
[**gETSearchPerson**](DefaultApi.md#gETSearchPerson) | **GET** /search/person | Search People
[**gETSearchTv**](DefaultApi.md#gETSearchTv) | **GET** /search/tv | Search TV Shows
[**gETTrendingMediaTypeTimeWindow**](DefaultApi.md#gETTrendingMediaTypeTimeWindow) | **GET** /trending/{media_type}/{time_window} | Get Trending
[**gETTvAiringToday**](DefaultApi.md#gETTvAiringToday) | **GET** /tv/airing_today | Get TV Airing Today
[**gETTvChanges**](DefaultApi.md#gETTvChanges) | **GET** /tv/changes | Get TV Change List
[**gETTvEpisodeEpisodeIdChanges**](DefaultApi.md#gETTvEpisodeEpisodeIdChanges) | **GET** /tv/episode/{episode_id}/changes | Get Changes
[**gETTvEpisodeGroupId**](DefaultApi.md#gETTvEpisodeGroupId) | **GET** /tv/episode_group/{id} | Get Details
[**gETTvLatest**](DefaultApi.md#gETTvLatest) | **GET** /tv/latest | Get Latest
[**gETTvOnTheAir**](DefaultApi.md#gETTvOnTheAir) | **GET** /tv/on_the_air | Get TV On The Air
[**gETTvPopular**](DefaultApi.md#gETTvPopular) | **GET** /tv/popular | Get Popular
[**gETTvSeasonSeasonIdChanges**](DefaultApi.md#gETTvSeasonSeasonIdChanges) | **GET** /tv/season/{season_id}/changes | Get  Changes
[**gETTvTopRated**](DefaultApi.md#gETTvTopRated) | **GET** /tv/top_rated | Get Top Rated
[**gETTvTvId**](DefaultApi.md#gETTvTvId) | **GET** /tv/{tv_id} | Get Details
[**gETTvTvIdAccountStates**](DefaultApi.md#gETTvTvIdAccountStates) | **GET** /tv/{tv_id}/account_states | Get Account States
[**gETTvTvIdAlternativeTitles**](DefaultApi.md#gETTvTvIdAlternativeTitles) | **GET** /tv/{tv_id}/alternative_titles | Get Alternative Titles
[**gETTvTvIdChanges**](DefaultApi.md#gETTvTvIdChanges) | **GET** /tv/{tv_id}/changes | Get Changes
[**gETTvTvIdContentRatings**](DefaultApi.md#gETTvTvIdContentRatings) | **GET** /tv/{tv_id}/content_ratings | Get Content Ratings
[**gETTvTvIdCredits**](DefaultApi.md#gETTvTvIdCredits) | **GET** /tv/{tv_id}/credits | Get Credits
[**gETTvTvIdEpisodeGroups**](DefaultApi.md#gETTvTvIdEpisodeGroups) | **GET** /tv/{tv_id}/episode_groups | Get Episode Groups
[**gETTvTvIdExternalIds**](DefaultApi.md#gETTvTvIdExternalIds) | **GET** /tv/{tv_id}/external_ids | Get External IDs
[**gETTvTvIdImages**](DefaultApi.md#gETTvTvIdImages) | **GET** /tv/{tv_id}/images | Get Images
[**gETTvTvIdKeywords**](DefaultApi.md#gETTvTvIdKeywords) | **GET** /tv/{tv_id}/keywords | Get Keywords
[**gETTvTvIdRecommendations**](DefaultApi.md#gETTvTvIdRecommendations) | **GET** /tv/{tv_id}/recommendations | Get Recommendations
[**gETTvTvIdReviews**](DefaultApi.md#gETTvTvIdReviews) | **GET** /tv/{tv_id}/reviews | Get Reviews
[**gETTvTvIdScreenedTheatrically**](DefaultApi.md#gETTvTvIdScreenedTheatrically) | **GET** /tv/{tv_id}/screened_theatrically | Get Screened Theatrically
[**gETTvTvIdSeasonSeasonNumber**](DefaultApi.md#gETTvTvIdSeasonSeasonNumber) | **GET** /tv/{tv_id}/season/{season_number} | Get Details
[**gETTvTvIdSeasonSeasonNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/account_states | Get Account States
[**gETTvTvIdSeasonSeasonNumberCredits**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberCredits) | **GET** /tv/{tv_id}/season/{season_number}/credits | Get Credits
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number} | Get Details
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states | Get Account States
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits | Get Credits
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids | Get External IDs
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images | Get Images
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations | Get Translations
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos | Get  Videos
[**gETTvTvIdSeasonSeasonNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/external_ids | Get External IDs
[**gETTvTvIdSeasonSeasonNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/images | Get Images
[**gETTvTvIdSeasonSeasonNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/videos | Get Videos
[**gETTvTvIdSimilar**](DefaultApi.md#gETTvTvIdSimilar) | **GET** /tv/{tv_id}/similar | Get Similar TV Shows
[**gETTvTvIdTranslations**](DefaultApi.md#gETTvTvIdTranslations) | **GET** /tv/{tv_id}/translations | Get Translations
[**gETTvTvIdVideos**](DefaultApi.md#gETTvTvIdVideos) | **GET** /tv/{tv_id}/videos | Get Videos
[**pOSTAccountAccountIdFavorite**](DefaultApi.md#pOSTAccountAccountIdFavorite) | **POST** /account/{account_id}/favorite | Mark as Favorite
[**pOSTAccountAccountIdWatchlist**](DefaultApi.md#pOSTAccountAccountIdWatchlist) | **POST** /account/{account_id}/watchlist | Add to Watchlist
[**pOSTAuthenticationSessionConvert4**](DefaultApi.md#pOSTAuthenticationSessionConvert4) | **POST** /authentication/session/convert/4 | Create Session (from v4 access token)
[**pOSTAuthenticationSessionNew**](DefaultApi.md#pOSTAuthenticationSessionNew) | **POST** /authentication/session/new | Create Session
[**pOSTAuthenticationTokenValidateWithLogin**](DefaultApi.md#pOSTAuthenticationTokenValidateWithLogin) | **POST** /authentication/token/validate_with_login | Create Session With Login
[**pOSTList**](DefaultApi.md#pOSTList) | **POST** /list | Create List
[**pOSTListListIdAddItem**](DefaultApi.md#pOSTListListIdAddItem) | **POST** /list/{list_id}/add_item | Add Movie
[**pOSTListListIdClear**](DefaultApi.md#pOSTListListIdClear) | **POST** /list/{list_id}/clear | Clear List
[**pOSTListListIdRemoveItem**](DefaultApi.md#pOSTListListIdRemoveItem) | **POST** /list/{list_id}/remove_item | Remove Movie
[**pOSTMovieMovieIdRating**](DefaultApi.md#pOSTMovieMovieIdRating) | **POST** /movie/{movie_id}/rating | Rate Movie
[**pOSTTvTvIdRating**](DefaultApi.md#pOSTTvTvIdRating) | **POST** /tv/{tv_id}/rating | Rate TV Show
[**pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **POST** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Rate TV Episode

<a name="dELETEAuthenticationSession"></a>
# **dELETEAuthenticationSession**
> Object dELETEAuthenticationSession(body)

Delete Session

If you would like to delete (or \&quot;logout\&quot;) from a session, call this method with a valid session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.dELETEAuthenticationSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEAuthenticationSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dELETEListListId"></a>
# **dELETEListListId**
> Object dELETEListListId(listId, sessionId)

Delete List

Delete a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.dELETEListListId(listId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEListListId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETEMovieMovieIdRating"></a>
# **dELETEMovieMovieIdRating**
> Object dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String contentType = "contentType_example"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEMovieMovieIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **contentType** | **String**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETETvTvIdRating"></a>
# **dELETETvTvIdRating**
> Object dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
String contentType = "contentType_example"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETETvTvIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **contentType** | **String**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating"></a>
# **dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**
> Object dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
String contentType = "contentType_example"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **contentType** | **String**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccount"></a>
# **gETAccount**
> Object gETAccount(sessionId)

Get Details

Get your account details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccount(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdFavoriteMovies"></a>
# **gETAccountAccountIdFavoriteMovies**
> Object gETAccountAccountIdFavoriteMovies(accountId, sessionId)

Get Favorite Movies

Get the list of your favorite movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdFavoriteMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdFavoriteTv"></a>
# **gETAccountAccountIdFavoriteTv**
> Object gETAccountAccountIdFavoriteTv(accountId, sessionId)

Get Favorite TV Shows

Get the list of your favorite TV shows.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdFavoriteTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdLists"></a>
# **gETAccountAccountIdLists**
> Object gETAccountAccountIdLists(accountId, sessionId, apiKey)

Get Created Lists

Get all of the lists created by an account. Will invlude private lists if you are the owner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdLists(accountId, sessionId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedMovies"></a>
# **gETAccountAccountIdRatedMovies**
> Object gETAccountAccountIdRatedMovies(accountId, sessionId)

Get Rated Movies

Get a list of all the movies you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdRatedMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedTv"></a>
# **gETAccountAccountIdRatedTv**
> Object gETAccountAccountIdRatedTv(accountId, sessionId)

Get Rated TV Shows

Get a list of all the TV shows you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdRatedTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedTvEpisodes"></a>
# **gETAccountAccountIdRatedTvEpisodes**
> Object gETAccountAccountIdRatedTvEpisodes(accountId, sessionId)

Get Rated TV Episodes

Get a list of all the TV episodes you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdRatedTvEpisodes(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTvEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdWatchlistMovies"></a>
# **gETAccountAccountIdWatchlistMovies**
> Object gETAccountAccountIdWatchlistMovies(accountId, sessionId)

Get Movie Watchlist

Get a list of all the movies you have added to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdWatchlistMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdWatchlistTv"></a>
# **gETAccountAccountIdWatchlistTv**
> Object gETAccountAccountIdWatchlistTv(accountId, sessionId)

Get TV Show Watchlist

Get a list of all the TV shows you have added to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETAccountAccountIdWatchlistTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAuthenticationGuestSessionNew"></a>
# **gETAuthenticationGuestSessionNew**
> Object gETAuthenticationGuestSessionNew()

Create Guest Session

This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDb user account. More information about user authentication can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).  Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDb user account in the future. There is also IP limits in place so you should always make sure it&#x27;s the end user doing the guest session actions.  If a guest session is not used for the first time within 24 hours, it will be automatically deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETAuthenticationGuestSessionNew();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAuthenticationGuestSessionNew");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAuthenticationTokenNew"></a>
# **gETAuthenticationTokenNew**
> Object gETAuthenticationTokenNew()

Create Request Token

Create a temporary request token that can be used to validate a TMDb user login. More details about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETAuthenticationTokenNew();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAuthenticationTokenNew");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCertificationMovieList"></a>
# **gETCertificationMovieList**
> Object gETCertificationMovieList()

Get Movie Certifications

Get an up to date list of the officially supported movie certifications on TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETCertificationMovieList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCertificationMovieList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCertificationTvList"></a>
# **gETCertificationTvList**
> Object gETCertificationTvList()

Get TV Certifications

Get an up to date list of the officially supported TV show certifications on TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETCertificationTvList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCertificationTvList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionId"></a>
# **gETCollectionCollectionId**
> Object gETCollectionCollectionId(collectionId)

Get Details

Get collection details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the [translations](#endpoint:bhcsxEgRvyk3N7FnD) method. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    Object result = apiInstance.gETCollectionCollectionId(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionIdImages"></a>
# **gETCollectionCollectionIdImages**
> Object gETCollectionCollectionIdImages(collectionId)

Get Images

Get the images for a collection by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    Object result = apiInstance.gETCollectionCollectionIdImages(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionIdTranslations"></a>
# **gETCollectionCollectionIdTranslations**
> Object gETCollectionCollectionIdTranslations(collectionId)

Get Translations

Get the list translations for a collection by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    Object result = apiInstance.gETCollectionCollectionIdTranslations(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyId"></a>
# **gETCompanyCompanyId**
> Object gETCompanyCompanyId(companyId)

Get Details

Get a companies details by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    Object result = apiInstance.gETCompanyCompanyId(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyIdAlternativeNames"></a>
# **gETCompanyCompanyIdAlternativeNames**
> Object gETCompanyCompanyIdAlternativeNames(companyId)

Get Alternative Names

Get the alternative names of a company.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    Object result = apiInstance.gETCompanyCompanyIdAlternativeNames(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdAlternativeNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyIdImages"></a>
# **gETCompanyCompanyIdImages**
> Object gETCompanyCompanyIdImages(companyId)

Get Images

Get a companies logos by id.  There are two image formats that are supported for companies, PNG&#x27;s and SVG&#x27;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#x27;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#x27;s and PNG&#x27;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    Object result = apiInstance.gETCompanyCompanyIdImages(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfiguration"></a>
# **gETConfiguration**
> Object gETConfiguration(apiKey)

Get API Configuration

Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.  This method currently holds the data relevant to building image URLs as well as the change key map.  To build an image URL, you will need 3 pieces of data. The &#x60;base_url&#x60;, &#x60;size&#x60; and &#x60;file_path&#x60;. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:      https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg  The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETConfiguration(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationCountries"></a>
# **gETConfigurationCountries**
> List&lt;Object&gt; gETConfigurationCountries(apiKey)

Get Countries

Get the list of countries (ISO 3166-1 tags) used throughout TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<Object> result = apiInstance.gETConfigurationCountries(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationJobs"></a>
# **gETConfigurationJobs**
> List&lt;Object&gt; gETConfigurationJobs(apiKey)

Get Jobs

Get a list of the jobs and departments we use on TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<Object> result = apiInstance.gETConfigurationJobs(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationLanguages"></a>
# **gETConfigurationLanguages**
> List&lt;Object&gt; gETConfigurationLanguages(apiKey)

Get Languages

Get the list of languages (ISO 639-1 tags) used throughout TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<Object> result = apiInstance.gETConfigurationLanguages(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationPrimaryTranslations"></a>
# **gETConfigurationPrimaryTranslations**
> List&lt;String&gt; gETConfigurationPrimaryTranslations(apiKey)

Get Primary Translations

Get a list of the _officially_ supported translations on TMDb.  While it&#x27;s technically possible to add a translation in any one of the [languages](#endpoint:tem8QfFFyAfWodrCv) we have added to TMDb (we don&#x27;t restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the \&quot;primary\&quot; translations.  These are all specified as [IETF tags](https://en.wikipedia.org/wiki/IETF_language_tag) to identify the languages we use on TMDb. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.  We&#x27;re always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on [the forums](https://www.themoviedb.org/talk/category/5047951f760ee3318900009a).  One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project [here](https://www.localeapp.com/projects/8267).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<String> result = apiInstance.gETConfigurationPrimaryTranslations(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationPrimaryTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationTimezones"></a>
# **gETConfigurationTimezones**
> List&lt;Object&gt; gETConfigurationTimezones(apiKey)

Get Timezones

Get the list of timezones used throughout TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<Object> result = apiInstance.gETConfigurationTimezones(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationTimezones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCreditCreditId"></a>
# **gETCreditCreditId**
> Object gETCreditCreditId(creditId)

Get Details

Get a movie or TV credit details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 13, 2018 | Movie credits are now supported. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String creditId = "creditId_example"; // String | 
try {
    Object result = apiInstance.gETCreditCreditId(creditId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCreditCreditId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETDiscoverMovie"></a>
# **gETDiscoverMovie**
> Object gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage)

Movie Discover

Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the [certifications list](#endpoint:faFKjuKG2HnwexAWM) method.  Discover also supports a nice list of sort options. See below for all of the available options.  Please note, when using &#x60;certification&#x60; \\ &#x60;certification.lte&#x60; you must also specify &#x60;certification_country&#x60;. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our [certifications list](#endpoint:faFKjuKG2HnwexAWM).  If you specify the &#x60;region&#x60; parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a &#x60;with_release_type&#x60; is specified). It&#x27;s important to note the order of the release types that are used. Specifying \&quot;2|3\&quot; would return the limited theatrical release date as opposed to \&quot;3|2\&quot; which would return the theatrical date.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#x27;s are treated like an &#x60;AND&#x60; and query while pipe&#x27;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sortBy = "sortBy_example"; // String | Choose from one of the many available sort options.
String certificationCountry = "certificationCountry_example"; // String | Used in conjunction with the certification filter, use this to specify a country with a valid certification.
String certification = "certification_example"; // String | Filter results with a valid certification from the 'certification_country' field.
String certificationLte = "certificationLte_example"; // String | Filter and only include movies that have a certification that is less than or equal to the specified value.
String certificationGte = "certificationGte_example"; // String | Filter and only include movies that have a certification that is greater than or equal to the specified value.
Boolean includeAdult = true; // Boolean | A filter and include or exclude adult movies.
Boolean includeVideo = true; // Boolean | A filter to include or exclude videos.
String language = "language_example"; // String | Specify a language to query translatable fields with.
Integer page = 56; // Integer | Specify the page of results to query.
Integer primaryReleaseYear = 56; // Integer | A filter to limit the results to a specific primary release year.
LocalDate primaryReleaseDateGte = new LocalDate(); // LocalDate | Filter and only include movies that have a primary release date that is greater or equal to the specified value.
LocalDate primaryReleaseDateLte = new LocalDate(); // LocalDate | Filter and only include movies that have a primary release date that is less than or equal to the specified value.
LocalDate releaseDateGte = new LocalDate(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value.
LocalDate releaseDateLte = new LocalDate(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value.
Integer withReleaseType = 56; // Integer | Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method.
Integer year = 56; // Integer | A filter to limit the results to a specific year (looking at all release dates).
Integer voteCountGte = 56; // Integer | Filter and only include movies that have a vote count that is greater or equal to the specified value.
Integer voteCountLte = 56; // Integer | Filter and only include movies that have a vote count that is less than or equal to the specified value.
BigDecimal voteAverageGte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
BigDecimal voteAverageLte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is less than or equal to the specified value.
String withCast = "withCast_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as an actor.
String withCrew = "withCrew_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a crew member.
String withPeople = "withPeople_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a either a actor or a crew member.
String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes movies that have one of the ID's added as a keyword.
String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
Integer withRuntimeGte = 56; // Integer | Filter and only include movies that have a runtime that is greater or equal to a value.
Integer withRuntimeLte = 56; // Integer | Filter and only include movies that have a runtime that is less than or equal to a value.
String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
try {
    Object result = apiInstance.gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETDiscoverMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [enum: , popularity.asc, popularity.desc, release_date.asc, release_date.desc, revenue.asc, revenue.desc, primary_release_date.asc, primary_release_date.desc, original_title.asc, original_title.desc, vote_average.asc, vote_average.desc, vote_count.asc, vote_count.desc]
 **certificationCountry** | **String**| Used in conjunction with the certification filter, use this to specify a country with a valid certification. | [optional]
 **certification** | **String**| Filter results with a valid certification from the &#x27;certification_country&#x27; field. | [optional]
 **certificationLte** | **String**| Filter and only include movies that have a certification that is less than or equal to the specified value. | [optional]
 **certificationGte** | **String**| Filter and only include movies that have a certification that is greater than or equal to the specified value. | [optional]
 **includeAdult** | **Boolean**| A filter and include or exclude adult movies. | [optional]
 **includeVideo** | **Boolean**| A filter to include or exclude videos. | [optional]
 **language** | **String**| Specify a language to query translatable fields with. | [optional]
 **page** | **Integer**| Specify the page of results to query. | [optional] [enum: ]
 **primaryReleaseYear** | **Integer**| A filter to limit the results to a specific primary release year. | [optional]
 **primaryReleaseDateGte** | **LocalDate**| Filter and only include movies that have a primary release date that is greater or equal to the specified value. | [optional]
 **primaryReleaseDateLte** | **LocalDate**| Filter and only include movies that have a primary release date that is less than or equal to the specified value. | [optional]
 **releaseDateGte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value. | [optional]
 **releaseDateLte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value. | [optional]
 **withReleaseType** | **Integer**| Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method. | [optional] [enum: ]
 **year** | **Integer**| A filter to limit the results to a specific year (looking at all release dates). | [optional]
 **voteCountGte** | **Integer**| Filter and only include movies that have a vote count that is greater or equal to the specified value. | [optional] [enum: ]
 **voteCountLte** | **Integer**| Filter and only include movies that have a vote count that is less than or equal to the specified value. | [optional] [enum: ]
 **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional]
 **voteAverageLte** | **BigDecimal**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional]
 **withCast** | **String**| A comma separated list of person ID&#x27;s. Only include movies that have one of the ID&#x27;s added as an actor. | [optional]
 **withCrew** | **String**| A comma separated list of person ID&#x27;s. Only include movies that have one of the ID&#x27;s added as a crew member. | [optional]
 **withPeople** | **String**| A comma separated list of person ID&#x27;s. Only include movies that have one of the ID&#x27;s added as a either a actor or a crew member. | [optional]
 **withCompanies** | **String**| A comma separated list of production company ID&#x27;s. Only include movies that have one of the ID&#x27;s added as a production company. | [optional]
 **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional]
 **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional]
 **withKeywords** | **String**| A comma separated list of keyword ID&#x27;s. Only includes movies that have one of the ID&#x27;s added as a keyword. | [optional]
 **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#x27;AND&#x27; or &#x27;OR&#x27; logic. | [optional]
 **withRuntimeGte** | **Integer**| Filter and only include movies that have a runtime that is greater or equal to a value. | [optional]
 **withRuntimeLte** | **Integer**| Filter and only include movies that have a runtime that is less than or equal to a value. | [optional]
 **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETDiscoverTv"></a>
# **gETDiscoverTv**
> Object gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords)

TV Discover

Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.  Discover also supports a nice list of sort options. See below for all of the available options.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#x27;s are treated like an &#x60;AND&#x60; and query while pipe&#x27;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sortBy = "sortBy_example"; // String | Choose from one of the many available sort options.
LocalDate airDateGte = new LocalDate(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value.
LocalDate airDateLte = new LocalDate(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value.
LocalDate firstAirDateGte = new LocalDate(); // LocalDate | Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
LocalDate firstAirDateLte = new LocalDate(); // LocalDate | Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
Integer firstAirDateYear = 56; // Integer | Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
String language = "language_example"; // String | Specify a language to query translatable fields with.
Integer page = 56; // Integer | Specify the page of results to query.
String timezone = "timezone_example"; // String | Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset.
BigDecimal voteAverageGte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
Integer voteCountGte = 56; // Integer | Filter and only include movies that have a rating that is less than or equal to the specified value.
String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
String withNetworks = "withNetworks_example"; // String | Comma separated value of network ids that you want to include in the results.
String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
Integer withRuntimeGte = 56; // Integer | Filter and only include TV shows with an episode runtime that is greater than or equal to a value.
Integer withRuntimeLte = 56; // Integer | Filter and only include TV shows with an episode runtime that is less than or equal to a value.
Boolean includeNullFirstAirDates = true; // Boolean | Use this filter to include TV shows that don't have an air date while using any of the \"first_air_date\" filters.
String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
Boolean screenedTheatrically = true; // Boolean | Filter results to include items that have been screened theatrically.
String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes TV shows that have one of the ID's added as a keyword.
try {
    Object result = apiInstance.gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETDiscoverTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [enum: , vote_average.desc, vote_average.asc, first_air_date.desc, first_air_date.asc, popularity.desc, popularity.asc]
 **airDateGte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value. | [optional]
 **airDateLte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value. | [optional]
 **firstAirDateGte** | **LocalDate**| Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **firstAirDateLte** | **LocalDate**| Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **firstAirDateYear** | **Integer**| Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **language** | **String**| Specify a language to query translatable fields with. | [optional]
 **page** | **Integer**| Specify the page of results to query. | [optional]
 **timezone** | **String**| Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset. | [optional]
 **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional]
 **voteCountGte** | **Integer**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional] [enum: ]
 **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional]
 **withNetworks** | **String**| Comma separated value of network ids that you want to include in the results. | [optional]
 **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional]
 **withRuntimeGte** | **Integer**| Filter and only include TV shows with an episode runtime that is greater than or equal to a value. | [optional]
 **withRuntimeLte** | **Integer**| Filter and only include TV shows with an episode runtime that is less than or equal to a value. | [optional]
 **includeNullFirstAirDates** | **Boolean**| Use this filter to include TV shows that don&#x27;t have an air date while using any of the \&quot;first_air_date\&quot; filters. | [optional]
 **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional]
 **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#x27;AND&#x27; or &#x27;OR&#x27; logic. | [optional]
 **screenedTheatrically** | **Boolean**| Filter results to include items that have been screened theatrically. | [optional]
 **withCompanies** | **String**| A comma separated list of production company ID&#x27;s. Only include movies that have one of the ID&#x27;s added as a production company. | [optional]
 **withKeywords** | **String**| A comma separated list of keyword ID&#x27;s. Only includes TV shows that have one of the ID&#x27;s added as a keyword. | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETFindExternalId"></a>
# **gETFindExternalId**
> Object gETFindExternalId(externalId, externalSource)

Find by ID

The find method makes it easy to search for objects in our database by an external id. For example, an IMDB ID.  This method will search all objects (movies, TV shows and people) and return the results in a single response.  The supported external sources for each object are as follows.  #### Media Databases  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | IMDb ID      | ✓      | ✓        | ✗          | ✓           | ✓      | | TVDB ID      | ✗      | ✓        | ✓          | ✓           | ✗      | | Freebase MID*| ✗      | ✓        | ✓          | ✓           | ✓      | | Freebase ID* | ✗      | ✓        | ✓          | ✓           | ✓      | | TVRage ID*   | ✗      | ✓        | ✓          | ✓           | ✓      |  #### Social IDs  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | Facebook     | ✓      | ✓        | ✗          | ✗           | ✓      | | Instagram    | ✓      | ✓        | ✗          | ✗           | ✓      | | Twitter      | ✓      | ✓        | ✗          | ✗           | ✓      |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String externalId = "externalId_example"; // String | 
String externalSource = "externalSource_example"; // String | 
try {
    Object result = apiInstance.gETFindExternalId(externalId, externalSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETFindExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**|  |
 **externalSource** | **String**|  | [enum: imdb_id, freebase_mid, freebase_id, tvdb_id, tvrage_id, facebook_id, twitter_id, instagram_id]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGenreMovieList"></a>
# **gETGenreMovieList**
> Object gETGenreMovieList(language)

Get Movie List

Get the list of official genres for movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String language = "language_example"; // String | 
try {
    Object result = apiInstance.gETGenreMovieList(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGenreMovieList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGenreTvList"></a>
# **gETGenreTvList**
> Object gETGenreTvList()

Get TV List

Get the list of official genres for TV shows.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETGenreTvList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGenreTvList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedMovies"></a>
# **gETGuestSessionGuestSessionIdRatedMovies**
> Object gETGuestSessionGuestSessionIdRatedMovies(guestSessionId)

Get Rated Movies

Get the rated movies for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    Object result = apiInstance.gETGuestSessionGuestSessionIdRatedMovies(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedTv"></a>
# **gETGuestSessionGuestSessionIdRatedTv**
> Object gETGuestSessionGuestSessionIdRatedTv(guestSessionId)

Get Rated TV Shows

Get the rated TV shows for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    Object result = apiInstance.gETGuestSessionGuestSessionIdRatedTv(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedTvEpisodes"></a>
# **gETGuestSessionGuestSessionIdRatedTvEpisodes**
> Object gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId)

Get Rated TV Episodes

Get the rated TV episodes for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    Object result = apiInstance.gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTvEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETKeywordKeywordId"></a>
# **gETKeywordKeywordId**
> Object gETKeywordKeywordId(keywordId)

Get Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer keywordId = 56; // Integer | 
try {
    Object result = apiInstance.gETKeywordKeywordId(keywordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETKeywordKeywordId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETKeywordKeywordIdMovies"></a>
# **gETKeywordKeywordIdMovies**
> Object gETKeywordKeywordIdMovies(keywordId)

Get Movies

Get the movies that belong to a keyword.  We **highly recommend** using [movie discover](#endpoint:p5NyoR7dM842S8G9j) instead of this method as it is much more flexible.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer keywordId = 56; // Integer | 
try {
    Object result = apiInstance.gETKeywordKeywordIdMovies(keywordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETKeywordKeywordIdMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETListListId"></a>
# **gETListListId**
> Object gETListListId(listId)

Get Details

Get the details of a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
try {
    Object result = apiInstance.gETListListId(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETListListId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETListListIdItemStatus"></a>
# **gETListListIdItemStatus**
> Object gETListListIdItemStatus(listId, movieId)

Check Item Status

You can use this method to check if a movie has already been added to the list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
Integer movieId = 56; // Integer | 
try {
    Object result = apiInstance.gETListListIdItemStatus(listId, movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETListListIdItemStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **movieId** | **Integer**|  | [enum: ]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieChanges"></a>
# **gETMovieChanges**
> Object gETMovieChanges()

Get Movie Change List

Get  a list of all of the movie ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMovieChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieLatest"></a>
# **gETMovieLatest**
> Object gETMovieLatest()

Get Latest

Get the most newly created movie. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMovieLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieId"></a>
# **gETMovieMovieId**
> Object gETMovieMovieId(movieId)

Get Details

Get the primary information about a movie.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    Object result = apiInstance.gETMovieMovieId(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdAccountStates"></a>
# **gETMovieMovieIdAccountStates**
> Object gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId)

Get Account States

Grab the following account states for a session:  - Movie rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **sessionId** | **String**|  | [optional]
 **guestSessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdAlternativeTitles"></a>
# **gETMovieMovieIdAlternativeTitles**
> Object gETMovieMovieIdAlternativeTitles(movieId, country)

Get Alternative Titles

Get all of the alternative titles for a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the &#x60;type&#x60; field. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String country = "country_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdAlternativeTitles(movieId, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAlternativeTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **country** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdChanges"></a>
# **gETMovieMovieIdChanges**
> Object gETMovieMovieIdChanges(movieId)

Get Changes

Get the changes for a movie. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    Object result = apiInstance.gETMovieMovieIdChanges(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdCredits"></a>
# **gETMovieMovieIdCredits**
> Object gETMovieMovieIdCredits(movieId)

Get Credits

Get the cast and crew for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    Object result = apiInstance.gETMovieMovieIdCredits(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdExternalIds"></a>
# **gETMovieMovieIdExternalIds**
> Object gETMovieMovieIdExternalIds(movieId, apiKey)

Get External IDs

Get the external ids for a movie. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | |                     | Instagram      | |                     | Twitter        |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdExternalIds(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdImages"></a>
# **gETMovieMovieIdImages**
> Object gETMovieMovieIdImages(movieId, includeImageLanguage)

Get Images

Get the images that belong to a movie.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String includeImageLanguage = "includeImageLanguage_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdImages(movieId, includeImageLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **includeImageLanguage** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdKeywords"></a>
# **gETMovieMovieIdKeywords**
> Object gETMovieMovieIdKeywords(movieId, apiKey)

Get Keywords

Get the keywords that have been added to a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdKeywords(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdLists"></a>
# **gETMovieMovieIdLists**
> Object gETMovieMovieIdLists(movieId, apiKey)

Get Lists

Get a list of lists that this movie belongs to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdLists(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdRecommendations"></a>
# **gETMovieMovieIdRecommendations**
> Object gETMovieMovieIdRecommendations(movieId, apiKey)

Get Recommendations

Get a list of recommended movies for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdRecommendations(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdReleaseDates"></a>
# **gETMovieMovieIdReleaseDates**
> Object gETMovieMovieIdReleaseDates(movieId, apiKey)

Get Release Dates

Get the release date along with the certification for a movie.  Release dates support different types:  1. Premiere 2. Theatrical (limited) 3. Theatrical 4. Digital 5. Physical 6. TV

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdReleaseDates(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReleaseDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdReviews"></a>
# **gETMovieMovieIdReviews**
> Object gETMovieMovieIdReviews(movieId, apiKey)

Get Reviews

Get the user reviews for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdReviews(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdSimilar"></a>
# **gETMovieMovieIdSimilar**
> Object gETMovieMovieIdSimilar(movieId, apiKey)

Get Similar Movies

Get a list of similar movies. This is **not** the same as the \&quot;Recommendation\&quot; system you see on the website.  These items are assembled by looking at keywords and genres.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdSimilar(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdSimilar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdTranslations"></a>
# **gETMovieMovieIdTranslations**
> Object gETMovieMovieIdTranslations(movieId, apiKey)

Get Translations

Get a list of translations that have been created for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdTranslations(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdVideos"></a>
# **gETMovieMovieIdVideos**
> Object gETMovieMovieIdVideos(movieId, apiKey)

Get Videos

Get the videos that have been added to a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    Object result = apiInstance.gETMovieMovieIdVideos(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieNowPlaying"></a>
# **gETMovieNowPlaying**
> Object gETMovieNowPlaying()

Get Now Playing

Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMovieNowPlaying();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieNowPlaying");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMoviePopular"></a>
# **gETMoviePopular**
> Object gETMoviePopular()

Get Popular

Get a list of the current popular movies on TMDb. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMoviePopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMoviePopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieTopRated"></a>
# **gETMovieTopRated**
> Object gETMovieTopRated()

Get Top Rated

Get the top rated movies on TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMovieTopRated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieTopRated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieUpcoming"></a>
# **gETMovieUpcoming**
> Object gETMovieUpcoming()

Get Upcoming

Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETMovieUpcoming();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieUpcoming");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkId"></a>
# **gETNetworkNetworkId**
> Object gETNetworkNetworkId(networkId)

Get Details

Get the details of a network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    Object result = apiInstance.gETNetworkNetworkId(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkIdAlternativeNames"></a>
# **gETNetworkNetworkIdAlternativeNames**
> Object gETNetworkNetworkIdAlternativeNames(networkId)

Get Alternative Names

Get the alternative names of a network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    Object result = apiInstance.gETNetworkNetworkIdAlternativeNames(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdAlternativeNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkIdImages"></a>
# **gETNetworkNetworkIdImages**
> Object gETNetworkNetworkIdImages(networkId)

Get Images

Get the TV network logos by id.  There are two image formats that are supported for networks, PNG&#x27;s and SVG&#x27;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#x27;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#x27;s and PNG&#x27;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    Object result = apiInstance.gETNetworkNetworkIdImages(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonChanges"></a>
# **gETPersonChanges**
> Object gETPersonChanges()

Get Person Change List

Get a list of all of the person ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETPersonChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonLatest"></a>
# **gETPersonLatest**
> Object gETPersonLatest()

Get Latest

Get the most newly created person. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETPersonLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonId"></a>
# **gETPersonPersonId**
> Object gETPersonPersonId(personId)

Get Details

Get the primary person details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | Added the &#x60;known_for_department&#x60; field. | | April 26, 2018 | Added the [translations](#endpoint:CSaMjCxXAtGpxNGfS) method. | | November 9, 2016 | Biographies are now translatable on TMDb. This means you can query person details with a language parameter. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonId(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdChanges"></a>
# **gETPersonPersonIdChanges**
> Object gETPersonPersonIdChanges(personId)

Get Changes

Get the changes for a person. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdChanges(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdCombinedCredits"></a>
# **gETPersonPersonIdCombinedCredits**
> Object gETPersonPersonIdCombinedCredits(personId)

Get Combined Credits

Get the movie and TV credits together in a single response.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdCombinedCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdCombinedCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdExternalIds"></a>
# **gETPersonPersonIdExternalIds**
> Object gETPersonPersonIdExternalIds(personId)

Get External IDs

Get the external ids for a person. We currently support the following external sources.  | **External Sources** | | ------------     | | IMDB ID          | | Facebook         | | Freebase MID     | | Freebase ID      | | Instagram        | | TVRage ID        | | Twitter          |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdExternalIds(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdImages"></a>
# **gETPersonPersonIdImages**
> Object gETPersonPersonIdImages(personId)

Get Images

Get the images for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdImages(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdMovieCredits"></a>
# **gETPersonPersonIdMovieCredits**
> Object gETPersonPersonIdMovieCredits(personId)

Get Movie Credits

Get the movie credits for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdMovieCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdMovieCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTaggedImages"></a>
# **gETPersonPersonIdTaggedImages**
> Object gETPersonPersonIdTaggedImages(personId)

Get Tagged Images

Get the images that this person has been tagged in.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdTaggedImages(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTaggedImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTranslations"></a>
# **gETPersonPersonIdTranslations**
> Object gETPersonPersonIdTranslations(personId)

Get Translations

Get a list of translations that have been created for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdTranslations(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTvCredits"></a>
# **gETPersonPersonIdTvCredits**
> Object gETPersonPersonIdTvCredits(personId)

Get TV Credits

Get the TV show credits for a person.  You can query for some extra details about the credit with the [credit method](#endpoint:xPWdEBLkvCNZSicLN).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    Object result = apiInstance.gETPersonPersonIdTvCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTvCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPopular"></a>
# **gETPersonPopular**
> Object gETPersonPopular()

Get Popular

Get the list of popular people on TMDb. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETPersonPopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETReviewReviewId"></a>
# **gETReviewReviewId**
> Object gETReviewReviewId(reviewId)

Get Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reviewId = "reviewId_example"; // String | 
try {
    Object result = apiInstance.gETReviewReviewId(reviewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETReviewReviewId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchCollection"></a>
# **gETSearchCollection**
> Object gETSearchCollection()

Search Collections

Search for collections.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETSearchCollection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchCollection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchCompany"></a>
# **gETSearchCompany**
> Object gETSearchCompany()

Search Companies

Search for companies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETSearchCompany();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchCompany");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchKeyword"></a>
# **gETSearchKeyword**
> Object gETSearchKeyword()

Search Keywords

Search for keywords.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETSearchKeyword();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchKeyword");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchMovie"></a>
# **gETSearchMovie**
> Object gETSearchMovie(year, primaryReleaseYear)

Search Movies

Search for movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer year = 56; // Integer | 
Integer primaryReleaseYear = 56; // Integer | 
try {
    Object result = apiInstance.gETSearchMovie(year, primaryReleaseYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**|  | [optional]
 **primaryReleaseYear** | **Integer**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchMulti"></a>
# **gETSearchMulti**
> Object gETSearchMulti()

Multi Search

Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETSearchMulti();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchMulti");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchPerson"></a>
# **gETSearchPerson**
> Object gETSearchPerson()

Search People

Search for people.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETSearchPerson();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchPerson");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchTv"></a>
# **gETSearchTv**
> Object gETSearchTv(firstAirDateYear)

Search TV Shows

Search for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer firstAirDateYear = 56; // Integer | 
try {
    Object result = apiInstance.gETSearchTv(firstAirDateYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstAirDateYear** | **Integer**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTrendingMediaTypeTimeWindow"></a>
# **gETTrendingMediaTypeTimeWindow**
> Object gETTrendingMediaTypeTimeWindow(mediaType, timeWindow)

Get Trending

Get the daily or weekly trending items. The daily trending list tracks items over the period of a day while items have a 24 hour half life. The weekly list tracks items over a 7 day period, with a 7 day half life.  #### Valid Media Types  | **Media Type** | **Description** | | - | - | | all | Include all movies, TV shows and people in the results as a global trending list. | | movie | Show the trending movies in the results. | | tv | Show the trending TV shows in the results. | | person | Show the trending people in the results. |  #### Valid Time Windows  | **Time Window** | **Description** | | - | - | | day | View the trending list for the day. | | week | View the trending list for the week. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String mediaType = "mediaType_example"; // String | 
String timeWindow = "timeWindow_example"; // String | 
try {
    Object result = apiInstance.gETTrendingMediaTypeTimeWindow(mediaType, timeWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTrendingMediaTypeTimeWindow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaType** | **String**|  | [enum: all, movie, tv, person]
 **timeWindow** | **String**|  | [enum: day, week]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvAiringToday"></a>
# **gETTvAiringToday**
> Object gETTvAiringToday()

Get TV Airing Today

Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.  You can specify a [timezone](endpoint:KQ4CDdEoWKJYLkrhS) to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvAiringToday();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvAiringToday");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvChanges"></a>
# **gETTvChanges**
> Object gETTvChanges()

Get TV Change List

Get a list of all of the TV show ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvEpisodeEpisodeIdChanges"></a>
# **gETTvEpisodeEpisodeIdChanges**
> Object gETTvEpisodeEpisodeIdChanges(episodeId)

Get Changes

Get the changes for a TV episode. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer episodeId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvEpisodeEpisodeIdChanges(episodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvEpisodeEpisodeIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **episodeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvEpisodeGroupId"></a>
# **gETTvEpisodeGroupId**
> Object gETTvEpisodeGroupId(id)

Get Details

Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:  1. Original air date 2. Absolute 3. DVD 4. Digital 5. Story arc 6. Production 7. TV

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    Object result = apiInstance.gETTvEpisodeGroupId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvEpisodeGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvLatest"></a>
# **gETTvLatest**
> Object gETTvLatest()

Get Latest

Get the most newly created TV show. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvOnTheAir"></a>
# **gETTvOnTheAir**
> Object gETTvOnTheAir()

Get TV On The Air

Get a list of shows that are currently on the air.  This query looks for any TV show that has an episode with an air date in the next 7 days.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvOnTheAir();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvOnTheAir");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvPopular"></a>
# **gETTvPopular**
> Object gETTvPopular()

Get Popular

Get a list of the current popular TV shows on TMDb. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvPopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvPopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvSeasonSeasonIdChanges"></a>
# **gETTvSeasonSeasonIdChanges**
> Object gETTvSeasonSeasonIdChanges(seasonId)

Get  Changes

Get the changes for a TV season. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer seasonId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvSeasonSeasonIdChanges(seasonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvSeasonSeasonIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seasonId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTopRated"></a>
# **gETTvTopRated**
> Object gETTvTopRated()

Get Top Rated

Get a list of the top rated TV shows on TMDb.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    Object result = apiInstance.gETTvTopRated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTopRated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvId"></a>
# **gETTvTvId**
> Object gETTvTvId(tvId)

Get Details

Get the primary TV show details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | We now return &#x60;last_episode_to_air&#x60; and &#x60;next_episode_to_air&#x60; fields. | | March 12, 2018 | Networks return proper logos and we introduced SVG support. | | March 8, 2018 | The &#x60;seasons&#x60; field now returns the translated names and overviews. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvId(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdAccountStates"></a>
# **gETTvTvIdAccountStates**
> Object gETTvTvIdAccountStates(tvId, guestSessionId, sessionId)

Get Account States

Grab the following account states for a session:  - TV show rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETTvTvIdAccountStates(tvId, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdAlternativeTitles"></a>
# **gETTvTvIdAlternativeTitles**
> Object gETTvTvIdAlternativeTitles(tvId)

Get Alternative Titles

Returns all of the alternative titles for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdAlternativeTitles(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdAlternativeTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdChanges"></a>
# **gETTvTvIdChanges**
> Object gETTvTvIdChanges(tvId)

Get Changes

Get the changes for a TV show. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.  TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a &#x60;series_id&#x60; and &#x60;episode_id&#x60;. You can use the [season changes](#endpoint:ZqhtyQbJ4YXz8RSya) and [episode changes](#endpoint:FpqrhBzgf2RJv4bHC) methods to look these up individually.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdChanges(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdContentRatings"></a>
# **gETTvTvIdContentRatings**
> Object gETTvTvIdContentRatings(tvId)

Get Content Ratings

Get the list of content ratings (certifications) that have been added to a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdContentRatings(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdContentRatings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdCredits"></a>
# **gETTvTvIdCredits**
> Object gETTvTvIdCredits(tvId)

Get Credits

Get the credits (cast and crew) that have been added to a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdCredits(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdEpisodeGroups"></a>
# **gETTvTvIdEpisodeGroups**
> Object gETTvTvIdEpisodeGroups(tvId)

Get Episode Groups

Get all of the episode groups that have been created for a TV show. With a group ID you can call the [get TV episode group details](#endpoint:yCouThc88qs7DGHY5) method.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdEpisodeGroups(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdEpisodeGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdExternalIds"></a>
# **gETTvTvIdExternalIds**
> Object gETTvTvIdExternalIds(tvId)

Get External IDs

Get the external ids for a TV show. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | | TVDB ID             | Instagram      | | Freebase MID*       | Twitter        | | Freebase ID*        |                | | TVRage ID*          |                |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdExternalIds(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdImages"></a>
# **gETTvTvIdImages**
> Object gETTvTvIdImages(tvId)

Get Images

Get the images that belong to a TV show.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdImages(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdKeywords"></a>
# **gETTvTvIdKeywords**
> Object gETTvTvIdKeywords(tvId)

Get Keywords

Get the keywords that have been added to a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdKeywords(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdRecommendations"></a>
# **gETTvTvIdRecommendations**
> Object gETTvTvIdRecommendations(tvId)

Get Recommendations

Get the list of TV show recommendations for this item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdRecommendations(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdReviews"></a>
# **gETTvTvIdReviews**
> Object gETTvTvIdReviews(tvId)

Get Reviews

Get the reviews for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdReviews(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdScreenedTheatrically"></a>
# **gETTvTvIdScreenedTheatrically**
> Object gETTvTvIdScreenedTheatrically(tvId)

Get Screened Theatrically

Get a list of seasons or episodes that have been screened in a film festival or theatre.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdScreenedTheatrically(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdScreenedTheatrically");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumber"></a>
# **gETTvTvIdSeasonSeasonNumber**
> Object gETTvTvIdSeasonSeasonNumber(tvId, seasonNumber)

Get Details

Get the TV season details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumber(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberAccountStates"></a>
# **gETTvTvIdSeasonSeasonNumberAccountStates**
> Object gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId)

Get Account States

Returns all of the user ratings for the season&#x27;s episodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberCredits"></a>
# **gETTvTvIdSeasonSeasonNumberCredits**
> Object gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber)

Get Credits

Get the credits for TV season.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber)

Get Details

Get the TV episode details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | June 1, 2018 | Added the [translations](#endpoint:5SFwZar3LkP99QMp7) method. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId)

Get Account States

Get your rating for a episode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits(tvId, seasonNumber, episodeNumber)

Get Credits

Get the credits (cast, crew and guest stars) for a TV episode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber)

Get External IDs

Get the external ids for a TV episode. We currently support the following external sources.  | **External Sources** | | -------------------- | | IMDb ID              | | TVDB ID              | | Freebase MID*        | | Freebase ID*         | | TVRage ID*           |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber)

Get Images

Get the images that belong to a TV episode.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber)

Get Translations

Get the translation data for an episode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos**
> Object gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber)

Get  Videos

Get the videos that have been added to a TV episode.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot;, \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberExternalIds"></a>
# **gETTvTvIdSeasonSeasonNumberExternalIds**
> Object gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber)

Get External IDs

Get the external ids for a TV season. We currently support the following external sources.  | **Media Databases** | | ------------------- | | TVDB ID             | | Freebase MID*       | | Freebase ID*        | | TVRage ID*          |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberImages"></a>
# **gETTvTvIdSeasonSeasonNumberImages**
> Object gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber)

Get Images

Get the images that belong to a TV season.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberVideos"></a>
# **gETTvTvIdSeasonSeasonNumberVideos**
> Object gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber)

Get Videos

Get the videos that have been added to a TV season.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSimilar"></a>
# **gETTvTvIdSimilar**
> Object gETTvTvIdSimilar(tvId)

Get Similar TV Shows

Get a list of similar TV shows. These items are assembled by looking at keywords and genres.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdSimilar(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSimilar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdTranslations"></a>
# **gETTvTvIdTranslations**
> Object gETTvTvIdTranslations(tvId)

Get Translations

Get a list of the translations that exist for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdTranslations(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdVideos"></a>
# **gETTvTvIdVideos**
> Object gETTvTvIdVideos(tvId)

Get Videos

Get the videos that have been added to a TV show.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    Object result = apiInstance.gETTvTvIdVideos(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTAccountAccountIdFavorite"></a>
# **pOSTAccountAccountIdFavorite**
> Object pOSTAccountAccountIdFavorite(contentType, sessionId, accountId, body)

Mark as Favorite

This method allows you to mark a movie or TV show as a favorite item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
String sessionId = "sessionId_example"; // String | 
Integer accountId = 56; // Integer | 
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTAccountAccountIdFavorite(contentType, sessionId, accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **sessionId** | **String**|  |
 **accountId** | **Integer**|  |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAccountAccountIdWatchlist"></a>
# **pOSTAccountAccountIdWatchlist**
> Object pOSTAccountAccountIdWatchlist(contentType, sessionId, accountId, body)

Add to Watchlist

Add a movie or TV show to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
String sessionId = "sessionId_example"; // String | 
Integer accountId = 56; // Integer | 
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTAccountAccountIdWatchlist(contentType, sessionId, accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdWatchlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **sessionId** | **String**|  |
 **accountId** | **Integer**|  |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationSessionConvert4"></a>
# **pOSTAuthenticationSessionConvert4**
> Object pOSTAuthenticationSessionConvert4(body)

Create Session (from v4 access token)

Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard \&quot;read token\&quot; will not validate to create a session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTAuthenticationSessionConvert4(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionConvert4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationSessionNew"></a>
# **pOSTAuthenticationSessionNew**
> Object pOSTAuthenticationSessionNew(body)

Create Session

You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTAuthenticationSessionNew(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationTokenValidateWithLogin"></a>
# **pOSTAuthenticationTokenValidateWithLogin**
> Object pOSTAuthenticationTokenValidateWithLogin(body)

Create Session With Login

This method allows an application to validate a request token by entering a username and password.  Not all applications have access to a web view so this can be used as a substitute.  Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDb website. You can read about that method [here](#docTextSection:NSZtgz7zptsiLYxXZ).  If you decide to use this method please **use HTTPS**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTAuthenticationTokenValidateWithLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationTokenValidateWithLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTList"></a>
# **pOSTList**
> Object pOSTList(contentType, sessionId, body)

Create List

Create a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
String sessionId = "sessionId_example"; // String | 
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTList(contentType, sessionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **sessionId** | **String**|  |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTListListIdAddItem"></a>
# **pOSTListListIdAddItem**
> Object pOSTListListIdAddItem(contentType, sessionId, listId, body)

Add Movie

Add a movie to a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
String sessionId = "sessionId_example"; // String | 
String listId = "listId_example"; // String | 
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTListListIdAddItem(contentType, sessionId, listId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdAddItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **sessionId** | **String**|  |
 **listId** | **String**|  |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTListListIdClear"></a>
# **pOSTListListIdClear**
> Object pOSTListListIdClear(listId, confirm, sessionId)

Clear List

Clear all of the items from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
Boolean confirm = true; // Boolean | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.pOSTListListIdClear(listId, confirm, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdClear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **confirm** | **Boolean**|  |
 **sessionId** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTListListIdRemoveItem"></a>
# **pOSTListListIdRemoveItem**
> Object pOSTListListIdRemoveItem(contentType, sessionId, listId, body)

Remove Movie

Remove a movie from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
String sessionId = "sessionId_example"; // String | 
String listId = "listId_example"; // String | 
Object body = null; // Object | 
try {
    Object result = apiInstance.pOSTListListIdRemoveItem(contentType, sessionId, listId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdRemoveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **sessionId** | **String**|  |
 **listId** | **String**|  |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTMovieMovieIdRating"></a>
# **pOSTMovieMovieIdRating**
> Object pOSTMovieMovieIdRating(contentType, movieId, body, guestSessionId, sessionId)

Rate Movie

Rate a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
Integer movieId = 56; // Integer | 
Object body = null; // Object | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.pOSTMovieMovieIdRating(contentType, movieId, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTMovieMovieIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **movieId** | **Integer**|  |
 **body** | [**Object**](Object.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTTvTvIdRating"></a>
# **pOSTTvTvIdRating**
> Object pOSTTvTvIdRating(contentType, tvId, body, guestSessionId, sessionId)

Rate TV Show

Rate a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
Integer tvId = 56; // Integer | 
Object body = null; // Object | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.pOSTTvTvIdRating(contentType, tvId, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTTvTvIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **tvId** | **Integer**|  |
 **body** | [**Object**](Object.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating"></a>
# **pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**
> Object pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(contentType, tvId, seasonNumber, episodeNumber, body, guestSessionId, sessionId)

Rate TV Episode

Rate a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "contentType_example"; // String | 
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
Object body = null; // Object | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    Object result = apiInstance.pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(contentType, tvId, seasonNumber, episodeNumber, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **body** | [**Object**](Object.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

