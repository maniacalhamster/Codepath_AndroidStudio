# Project 3 - *Parstagram*

**Parstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **14** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to "Instagram".

The following **optional** features are implemented:

- [x] User sees app icon in home screen and styled bottom navigation view
- [x] Style the feed to look like the real Instagram feed.
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='./demo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Issues came up with creating an app icon, mostly from me not understanding what
viewport dimensions were and an initial attempt to create the instagram icon 
as a vector with hand inputted paths. I tried to use png files I downloaded off
the web and from the provided instagram icons but the quality went down. Also
tried online converters from png to svg, then importing android vector asset 
with those svg but the fill and background always had issues. After realizing
translating and scaling the icons was a big hassle, I found another
[site](https://editor.method.ac) that made creating a B&W copy of the instagram
icon a lot easier. Finding out adaptive icons take in 108x108 dp icon and 
gaurantee the center 66x66 dp won't be touched by masking - from this
[video](https://www.youtube.com/watch?v=5MHFYfXno9c] also helped a lot.

A new issue came up when I tried to add a progres bar as a stretch story. Even
though I set the progressbar to invisible, it still popped up and the value of
the variable that was supposed to load the progressbar was null when I debugged.
I thought I would just rollback to before I tried to implement the progressbar
with GIT but the progressbar still popped up (probably from untracked files).
Even on new emulators that got a the parstagram app for the first tiem ran into
this issue. Unfortunate that I didn't record a demo.gif before trying out the
stretch stories :/

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2021] [Akar Singh]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
