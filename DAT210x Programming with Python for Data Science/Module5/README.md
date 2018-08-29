Lab Assignment 1

Many U.S. cities, the U.S. federal government, and even other cities and governments abroad have started subscribing to an Open Data policy, because some data should be transparent and available to everyone to use and republish freely, without restrictions from copyright, patents, or other mechanisms of control. After reading their terms of use, in this lab you'll be exploring the City of Chicago's Crime data set, which is part of their Open Data initiative.

- Start by navigating over to the City of Chicago's Crimes dataset exploration page. It lists crimes from 2001 to the present, but you'll only be targeting Gambling. The city's website itself has hundreds of other datasets you can browse and do machine learning on.
- Open up the /Module5/Module5 - Lab1.ipynb starter code, and follow the directions to acquire the dataset and properly set it up.
- Fill out the doKMeans method to find and plot seven clusters and print out their centroids. These could be places a police officer investigates to check for on-going illegal activities.
- Re-run your assignment a few times over, looking at your printed and plotted results. 
Note: If Pandas complains about your data, you can use dropna() on any row that has NANs in it.

----------------------------

Lab Assignment 2

The spirit of data science includes exploration, traversing the unknown, and applying a deep understanding of the challenge you're facing. In an academic setting, it's hard to duplicate these tasks, but this lab will attempt to take a few steps away from the traditional, textbook, "plug the equation in" pattern, so you can get a taste of what analyzing data in the real world is all about.

After the September 11 attacks, a series of secret regulations, laws, and processes were enacted, perhaps to better protect the citizens of the United States. These processes continued through president Bush's term and were renewed and strengthened during the Obama administration. Then, on May 24, 2006, the United States Foreign Intelligence Surveillance Court (FISC) made a fundamental shift in its approach to Section 215 of the Patriot Act, permitting the FBI to compel production of "business records" relevant to terrorism investigations, which are shared with the NSA. The court now defined as business records the entirety of a telephone company's call database, also known as Call Detail Records (CDR or metadata).

News of this came to public light after an ex-NSA contractor leaked the information, and a few more questions were raised when it was further discovered that not just the call records of suspected terrorists were being collected in bulk... but perhaps the entirety of Americans as a whole. After all, if you know someone who knows someone who knows someone, your private records are relevant to a terrorism investigation. The white house quickly reassured the public in a press release that "Nobody is listening to your telephone calls," since, "that's not what this program is about." The public was greatly relieved.

The questions you'll be exploring in this lab assignment using K-Means are: exactly how useful is telephone metadata? It must have some use, otherwise the government wouldn't have invested however many millions they did into it secretly collecting it from phone carriers. Also what kind of intelligence can you extract from CDR metadata besides its face value?

You will be using a sample CDR dataset generated for 10 people living in the Dallas, Texas metroplex area. Your task will be to attempt to do what many researchers have already successfully done - partly de-anonymize the CDR data. People generally behave in predictable manners, moving from home to work with a few errands in between. With enough call data, given a few K-locations of interest, K-Means should be able to isolate rather easily the geolocations where a person spends the most of their time.

Note: to safeguard from doxing people, the CDR dataset you'll be using for this assignment was generated using the tools available in the Dive Deeper section. CDRs are at least supposed to be protected by privacy laws, and are the basis for proprietary revenue calculations. In reality, there are quite a few public CDRs out there. Much information can be discerned from them such as social networks, criminal acts, and believe it or not, even the spread of diseases as was demonstrated by Flowminder Foundation paper on Ebola.  

- Open up the starter code in /Module5/Module5 - Lab2.ipynb and read through it all. It's long, so make sure you understand everything that is being asked for you before proceeding.
- Load up the CDR dataset from /Module5/Datasets/CDR.csv. Do your due diligence to make sure it's been loaded correctly and all the features and rows match up.
- Pick the first unique user in the list to examine. Follow the steps in the assignment file to approximate where the user lives.
- Once you have a (Latitude, Longitude) coordinate pair, drop them into Google Maps. Just do a search for the "{Lat, Lon}". So if your centroid is located at Longitude = -96.949246 and Latitude = 32.953856, then do a maps search for "32.953856, -96.949246".

--------------------------------

Lab Assignment 3

Continuing on with the previous lab, this time you'll validate your results by comparing the user's weekday activity to their weekend activity. To get started, use the starter code in /Module5/Module5 - Lab3.py.

- Load up the same CDR dataset into a dataframe, and extract the unique "In" phone numbers. You don't have to save it as a Python list this time, and can keep it as an NDArray. The previous lab had you convert to a list just so you'd have the experience doing it.
- Create a new slice, once again for the first unique number in the CDR. Instead of limiting it to Weekend only entries, index it so that the slice only contains Weekday entries, Mon-Fri, and so that it occurs any time before 5pm.
- Run K-Means on the data with K=4. Plot the cellphone towers the user connected to, and then plot the cluster centers using a different marker and color.

----------------------------------

Lab Assignment 4

Feature scaling was first discussed within one of the PCA lab assignments, but this lab will really familiarize you with it. You will be making use of the Wholesale Customer's dataset, hosted by UCI's Machine Learning. Unsupervised clustering scans your features and then groups your samples based off of them. Therefore you should have a solid understanding of what each of your features are, which one's you should remove, and how to scale them in order for the 'blind' clustering to preform correctly and do what you want it to do.

- Visit the UCI dataset page and read all the content available, so you become accustomed to the dataset. Then, load up the starter code from Module5/Module5 - Lab4.py and as usual, read through that it in its entirety as well.
- The first thing that needs to be answered is, what is it you'd like to accomplish by clustering this dataset? There are a couple of potential questions you could ask given the data, and the one you choose will drive how you manipulate your dataset. Are you interested in which products people buy together, so that you can place them near one another in your store, or recommend the pair product when shopping online? Perhaps you're more interested in which products people are spending the most money on? Or maybe your interest just lies in identifying what individual products people are buying. All of this must be considered.
- For the purposes of this lab, you'll assume you're interested in overall customer behavior rather than channel or region specific behavior, so you'll drop those two fields from the dataset. If you were a large wholesaler with branches all over the nation, you'd want to keep those fields in so that you can duplicate the process outlined in the assignment to particular areas and vertical markets.
- Complete the assignment and answer the questions below.

------------------------------------

Lab Assignment 5

Remember that wheat dataset you used while exploring visualizations? It's about to make a comeback! While learning the many classification algorithms we're going to cover in the next few sections, it's a good idea to have a 'benchmark dataset' to come back to, so you can compare the performance and accuracy of other algorithms.

- Start by looking through the starter code /Module5/Module5 - Lab5.ipynb and /Module5/Datasets/wheat.data
- Complete the assignment except for the bonus instruction.
- Try experimenting with other feature scaling methods, in addition to normalize(), to see how they affect the decision boundary.

---------------------------------------

Lab Assignment 6

In this assignment, you'll flex your understanding of Isomap and KNeighbors, as well as practice splitting your data for testing and evaluation by taking your Module4/Module4 - Lab4.py lab to the next level. If you haven't been able to complete module four's labs or haven't fully understood them, take a moment to re-do them all before proceeding.

This assignment was engineered to be truer to the life of a data scientist by being more challenging than previous ones, so do not be disheartened. If data explorers only needed to drop their observations into black-box algorithms without investing time to toggle parameters, and experiment and understand what those algorithms were truly doing to their data, they wouldn't be valued as much.

In module four's fourth lab assignment, you explored using isomap, an indispensable tool to have while working with non-linear datasets. Your goal this time is to train the KNeighborsClassifier to identify what direction a face is pointing towards: either up, down, left, or right.
![](https://prod-edxapp.edx-cdn.org/assets/courseware/v1/db4094ea4712d0082cd24971423c1511/asset-v1:Microsoft+DAT210x+1T2018a+type@asset+block/M6L5_Faces.png)


This data takes the form of image samples that have been transformed either using PCA to reduce their linear dimensionality, or isomap to non-linearly do similar. Start by reviewing your lab work in the Module4/Module4 - Lab5.ipynb file before opening up the /Module5/Module5 - Lab6.ipynb starter code. You will need access to the face_data.mat file from Module four, as well as the new Module5/face_labels.csv file.

- Add in the Module4/Module4 - Lab4.ipynb cell blocks / code responsible for: loading up the .mat file, properly rotating its images, and storing the whole thing into a Pandas dataframe object.
- Load into a dataframe your classifications faces_labels.csv file. Make sure your dataframe and your .csv file align properly and start from the same values! This classification dataframe only has a single column in it, so create a series (a slice) that selects only that column and save it as label.
- Do your train_test_split just as directed in the reading. Set random_state=7 as documented. Your variables should be: data_train, data_test, label_train, and label_test.
- Fill out the code for PCA, Isomap, and KNeighborsClassifier. Both PCA and Isomap should be reducing your training data's dimensionality down to 2D. You're free to experiment with different K values for KNeighborsClassifier.
- Predict the accuracy of the test dataset / test label using .score() and print it out.
