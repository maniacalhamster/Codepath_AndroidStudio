# Flix
Flix is an app that allows users to browse movies from the
[The Movie Database API](http://docs.themoviedb.apiary.io/#) - drawing
inspiration/emulating the movie review site/app Flixster.

---
## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [ ] Implement a shared element transition when user clicks into the details of a movie (1 point).
- [ ] Trailers for popular movies are played automatically when the movie is selected (1 point).
  - [ ] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [ ] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [ ] Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
- [ ] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

<img src="./demo" width=250><br>

### Notes

I tested the app mostly on my own devices throughout the build process and it 
only occurred to me around submission time that I would need to run the app on
the emulator to get a demo gif. Issues came up with the youtube player failing
to run, and finding the cause of the issue took quite a while. I finally found
that the Flix tutorial we were following doesn't support API 30, creating a new
device with API 29 fixed the issue.

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
