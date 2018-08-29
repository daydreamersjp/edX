Lab Assignment 1

In this assignment, you're going to experiment with a real life armadillo sculpture scanned using a Cyberware 3030 MS 3D scanner at Stanford University. The sculpture is available as part of their 3D Scanning Repository, and is a very dense 3D mesh consisting of 172974 vertices! The mesh is available for you, located at /Module4/Datasets/stanford_armadillo.ply in the course github repository. It is not a Python script file, so don't attempt to load it with a text editor!



Start up Jupyter and open up the Module4/Module4 - Lab1.ipynb starter code in your browser, then read through it carefully. You will notice the use of a new library, Plyfile. This library loads up the 3D binary mesh for you. The mesh is further converted into a Pandas dataframe for your ease of manipulation.

Before changing any of the code, go ahead and just run through the notebook. You should see the 3D armadillo being rendered. It might take a while, considering its resolution. Your goal is to reduce its dimensionality from three to two using PCA to cast a shadow of the data onto its two most significant principal components. Then render the resulting 2D scatter plot. All of the detailed steps needed to accomplish this are listed inside of the notebook.

