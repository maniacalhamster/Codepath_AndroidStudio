# Flix
Flix is an app that allows users to browse movies from the
[The Movie Database API](http://docs.themoviedb.apiary.io/#) - drawing
inspiration/emulating the movie review site/app Flixster.

---

## Flix Part 1

### User Stories

#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x] (2pts) Views should be responsive for both landscape/portrait mode.
   - [x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [x] (2pts) Improved the user interface by experimenting with styling and coloring.
   - Added in a custom 'dark mode'-esque theme since the standard seemed kind of bright
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF

<img src="./demo.gif" width=250><br>

### Notes

 - Had an issue with Glide, which I found out was because I didn't wrote down
 the dependency wrong
 - Forgot how java's String.format worked and forgot to write %s for filling in
 the data when writing getPosterPath(), which further confused me
 after Glide was correctly set up (found my mistake after running Log calls 
 inside of MovieAdapter

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
