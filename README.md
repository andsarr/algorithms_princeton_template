# Algorithms. 
Solutions of the Algorithms courses of the [Princeton University](https://www.cs.princeton.edu/)  in Coursera.

Part I covers elementary data structures, sorting, and searching algorithms. Part II focuses on graph- and string-processing algorithms.

The details of the courses can fe found in:

+ [Algorithms, Part I](https://www.coursera.org/learn/algorithms-part1)
+ [Algorithms, Part II](https://www.coursera.org/learn/algorithms-part2)

## Structure 

The src folder contains the solutions for each week in the following structure:

+ Algorithms, Part I
  + `edu.princeton.cs.algorithms.percolation`: Solutions for the [Week 1](https://www.coursera.org/learn/algorithms-part1/home/week/1). The programming assignment specification could be found here: [Percolation](https://coursera.cs.princeton.edu/algs4/assignments/percolation/specification.php).
  + `edu.princeton.cs.algorithms.queues`: Solutions for the [Week 2](https://www.coursera.org/learn/algorithms-part1/home/week/2). The programming assignment specification could be found here: [Deques and Randomized Queues](https://coursera.cs.princeton.edu/algs4/assignments/queues/specification.php). 
  + `edu.princeton.cs.algorithms.collinearpoints`: Solutions for the [Week 3](https://www.coursera.org/learn/algorithms-part1/home/week/3). The programming assignment specification could be found here: [Collinear Points](https://coursera.cs.princeton.edu/algs4/assignments/collinear/specification.php).


#### Note
  The Gradle project creates for each assignment a task that will remove for each file, the package information and will put then
 in a zip file ready to submit to the Coursera platform. 
   Before creating the Zip file, it will run the tests, SpotBugs, PDM, and CheckStyle to verify the quality of the solution.