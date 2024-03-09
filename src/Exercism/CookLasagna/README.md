<!-- Lasagna Exercism -->
# Cook your lasagna
## Instructions
In this exercise you're going to write some code to help you cook a brilliant lasagna from your favorite cooking book.

You have four tasks, all related to the time spent cooking the lasagna.

### 1. Define the expected oven time in minutes

Define a `LASAGNA_MINUTES: int` constant that represents the time it takes to cook the lasagna. It must be set to 40.

### 2. Calculate the preparation time in minutes

Implement a `preparation_time_in_minutes(layers: int)` function that takes an `int` argument representing the number of layers of lasagna and returns how many minutes you would spend preparing the lasagna, assuming each layer takes 2 minutes to prepare.

### 3. Calculate the elapsed time in minutes

Implement an `elapsed_time_in_minutes(layers: int, elapsed: int)` function that takes two `int` arguments: the first argument is the number of layers of lasagna, and the second argument is the number of minutes the lasagna has been in the oven. The function should return how many minutes the lasagna has been cooking, assuming every layer takes 2 minutes to cook.

### 4. Calculate the remaining oven time in minutes

Implement a `remaining_time_in_minutes(layers: int, elapsed: int)` function that takes two `int` arguments: the first argument is the number of layers of lasagna, and the second argument is the number of minutes the lasagna has been in the oven. The function should return how many minutes the lasagna still needs to cook, assuming every layer takes 2 minutes to cook.

