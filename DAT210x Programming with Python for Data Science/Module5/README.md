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


--------------------------------

Lab Assignment 7

Breast cancer usually starts from an uncontrolled growth of the cells that make up the milk-producing ducts. While fairly uncommon with men (less than 0.1% experience it), according to BreastCancer.org, one in eight women (12%) end up developing a malignant form of breast cancer over the course of their lifetime. These invasive cells form tumors that destroy nearby tissue, can spread to other parts of the body, and if not duly addressed, may result in death. To put things into perspective, in the U.S., roughly 600 women die per year due to pregnancy related complications... yet over 40,000 die per year due to breast cancer.

Breast cancer doesn't develop over night and, like any other cancer, can be treated extremely effectively if detected in its earlier stages. Part of the understanding cancer is knowing that not all irregular cell growths are malignant; some are benign, or non-dangerous, non-cancerous growths. A benign tumor does not mean the mass doesn't increase in size, but only means it does not pose a threat to nearby tissue, nor is it likely to spread to other parts of the body. The mass simply stays wherever it's growing. Benign tumors are actually pretty popular, such as moles and some warts. Being able to properly assess if a tumor is actually benign and ignorable, or malignant and alarming is therefore of importance, and also is a problem that might be solvable through data and machine learning.

In this lab, you'll be using the Breast Cancer Wisconsin Original  data set, provided courtesy of UCI's Machine Learning Repository. A copy of the dataset is located at Module5/Datasets/breast-cancer-wisconsin.data. Here are the column names, which you can read more details about on the dataset's information page:

['sample', 'thickness', 'size', 'shape', 'adhesion', 'epithelial', 'nuclei', 'chromatin', 'nucleoli', 'mitoses', 'status'].
- Open up the starter code located in Module5/Module5 - Lab7.ipynb, and as usual, read through it entirely.
- Load up and clean up the dataset, and follow the written directions to split your data, do feature scaling since the features use different units, and then implement PCA and IsoMap so you can test the performance of both, as the technique used to reduce the dimensionality of the dataset down to two variables.
- Train KNeighborsClassifier on the 2D projected training dataset, the score KNeighborsClassifier on the 2D projected testing dataset.
- Finally, plot the decision boundary for visual confirmation.

-----------------------------

Lab Assignment 8

Advances in medicine, an increase in healthcare facilities, and improved standards of care have all contributed to an increased overall life expectancy over the last few decades. Although this might seem like great achievement for humanity, it has also led to the abandonment of more elderly people into senior-care and assisted living communities. The morality, benefits, and disadvantages of leaving one's parents in such facilities are still debatable; however, the fact that this practice has increased the financial burden on both the private-sector and government is not.

In this lab assignment, you will be using the subset a life expectancy dataset, provided courtesy of the Center for Disease Control and Prevention's National Center for Health Statistics page. The page hosts many open datasets on topics ranging from injuries, poverty, women's health, education, health insurance, and of course infectious diseases, and much more. But the one you'll be using is their "Life expectancy at birth, at age 65, and at age 75, by sex, race, and origin" data set, which has statistics dating back from the 1900's to current, taken within the United States. We have included a copy of the dataset as Module5/Datasets/life_expectancy.csv. The dataset only lists the life expectancy of whites and blacks, because throughout most of the collection period, those were the dominant two races that actively had their statistics recorded within the U.S.

Using linear regression, you will extrapolate how long people will live in the future. The private sector and governments mirror these calculations when computing social security payouts, taxes, infrastructure, and more. Fire up your Module5/Module5 - Lab8.ipynb starter code, and then complete the following:

- Make sure the dataset has been properly loaded.
- Create a linear model to use and re-use throughout the assignment. You can retrain the same model again, rather than re-creating a new instance of the class.
- Slice out using indexing any records before 1986 into a brand new slice.
- Have one slice for training and one for testing. First, map the life expectancy of white males as a function of age, or WhiteMales = f(age).
- Fit your model, draw a regression line and scatter plot with the convenience function, and then print out the actual, observed 2015 White Male life expectancy value from the dataset.
- Repeat for BlackFemale.
- Print out and display a correlation matrix for the dataset's features.

--------------------------------

Lab Assignment 9

Continue your exploration of linear regression using a public dataset provided courtesy of An Introduction to Statistical Learning, called College Acceptance and Enrollment. There are four relationships we are interested in modeling:

- The amount charged for room and board, expressed as a function of the number of: accepted students
- The number of enrolled students per college, expressed as a function of the number of: accepted students
- The number of failed undergraduate students per college, expressed as a function of: the number of accepted students
- The amount charged for room and board coupled with the number of enrolled students, expressed as a function of: the number of accepted students.

You should be able to find these relationships given the dataset. Start by downloading the data directly from this link, or through navigating the site linked above, and then complete the following actions:

- Read through the /Module5/Module5 - Lab9.ipynb starter code file. It's pretty long, but there actually isn't much in terms of coding you have to do. The hard part is in understanding the material.
- Load up the dataset, then use indexing to slice out the features of it we're interested in examining.
- Split your data into training and testing.
- Use the helper drawLine() and drawPlane() methods to display the results

----------------------------

Lab Assignment 10

Enhance! You've probably seen a movie or TV show where the super spy agents use some unbelievable technique to enhance a pixelated image, or to recover some lossy data. In this lab, you're going to do something similar—this time your objective is to use linear regression to recover or 'fill out' a completely deleted portion of an audio file!

![](https://prod-edxapp.edx-cdn.org/assets/courseware/v1/4c324d19171f8d1fb25e59c58f0957eb/asset-v1:Microsoft+DAT210x+1T2018a+type@asset+block/M6L7_Soundwave.png)


- To complete this lab, you will be using The FSDD, Free-Spoken-Digits-Dataset, an audio dataset put together by Zohar Jackson once he noticed there weren't very many cleaned up audio (no dead-space, roughly same length, same bitrate, same samples-per-second rate, etc) audio libraries ready for machine learning.

- Load up the started code stored at Module5/Module5 - Lab10.ipynb. Read through all of it, including the attached links. There are a lot of gems we'd like you to pick up that are only covered in the labs and not covered in detail in the course reading material, so be sure to make the most of it.
- There is a variable called Provided_Portion, which is the percentage of the audio clip you'd like to keep. Everything else will be deleted. It's currently set to 25%, so leave it there until you've completed and submitted the assignment; then you can experiment with it.
- Load up 50 sample recordings per specification in the lab file.
- Manipulate the dataset to prepare it for multi-output, linear regression by removing one of the images from the training set to use it as an independent testing sound. Then keep only Provided_Portion percent of the audio samples from the sound, discarding the rest.
- Save the generated sound file, listen to it, check its R^2 score.
Note: Here is a good note from SciKit-Learn's documentation on multi-output problems.
