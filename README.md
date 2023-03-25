# Fresh Carrots

<p align="center">
  <img src="./extras/logo.png" width="200" height="200"/>
</p>


You've heard of [Rotten Tomatoes](https://www.rottentomatoes.com/). Now feast your eyes on **Fresh Carrots**, a movie browsing app that allows users to browse the latest in Movies, TV, and People. What makes the app unique? Well, I think theres something powerful about words. Paired with a captivating poster, that’s all you need to invite the audience to click.  

**Fresh Carrots is simple yet functional; and elegant solution to the timeless question: What do I watch?**

With everything I create, I strive to give it a pretty face. Design is essential to me. The basis for this design was to capture the aesthetics of a carrot. Why carrots, you ask? Well, because tomatoes were taken. 🙃

*Note*:  
This app is still a work in progress. It initially started as a project for [CodePath's](https://www.codepath.org/) [Android Development Pathway](https://www.codepath.org/courses/android-development). I'm working to add more functionality. The Plan...
- Add the ability to click into movies/shows/people to display further details. 
- Add search functionality
- Publish app to Google Play Store

<img src="./extras/launch.gif" width="200" height="400"/>


<img src="./extras/four.gif" width="200" height="400"/>

## Required Features

The following **required** functionality is completed:



- [X] **Choose any endpoint on The MovieDB API except `now_playing`**
  - Chosen Endpoint: [Trending](https://developers.themoviedb.org/3/trending/get-trending) Actors
- [X] **Make a request to your chosen endpoint and implement a RecyclerView to display all entries**
- [X] **Use Glide to load and display at least one image per entry**
- [ ] **Click on an entry to view specific details about that entry using Intents**

The following **optional** features are implemented:

- [ ] **Add another API call and RecyclerView that lets the user interact with different data.** 
- [X] **Add rounded corners to the images using the Glide transformations**
- [ ] **Implement a shared element transition when user clicks into the details of a movie**

## Notes

Had trouble implementing details screen with intents. 
Confusion with data classes vs classes and @Serial used in lab 4 vs @Serialized used in lab 3

The old funtionality is kept in tact:

- [X] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [X] **Parse through JSON data and implement a RecyclerView to display all movies**
- [X] **Use Glide to load and display movie poster images**

<img src="./extras/portrait.gif" width="200" height="400"/>

The following **optional** features are implemented:

- [X] Improve and customize the user interface through styling and coloring
- [X] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [X] Implement Glide to display placeholder graphics during loading
  - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)
  
<img src="./extras/landscape.gif" width="200" height="400"/>

The following **additional** features are implemented:

- [X] Logo/App Icon
- [X] SplashScreen

## Video Walkthrough



<!-- Replace this with whatever GIF tool you used! -->
GIFs created with [EZGIF ](https://ezgif.com/)
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

Describe any challenges encountered while building the app.

Working with json arrays and formatting

## License

    Copyright [2023] [Vasanth Banumurthy]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
