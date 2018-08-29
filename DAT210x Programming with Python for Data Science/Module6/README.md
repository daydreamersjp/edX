Lab Assignment 1

In this lab, you'll get started with support vector classifier by revisiting UCI's wheat-seeds dataset. First, you will benchmark how long it takes to train and predict with SVC relative to how long K-Neighbors took to train and test, and then you'll compare the decision boundary plot produced by the two.

- Start by reviewing the starter code located in Module6/Module6 - Lab1.ipynb and of course the wheat dataset in Module6/Datasets/wheat.data. Be sure to read through everything, so that you know exactly what is being asked of you...
- Add in the KNN and SVC classifiers
- Load up your dataset properly and prune it
- Run the convenience benchmark and plotting functions

-----------------------------

Lab Assignment 2

"Is that a 1 or a 7?"

Even though the United States Postal Service, as an organization, was formed in 1971, it traces its roots back to the Post Office Department, an organization formed in 1792 by Benjamin Franklin. It later evolved into a cabinet-level department in 1872, before finally being transformed into the USPS we know today in 1971, as an agency of the U.S. government.

Back in the day, all mail was hand read and delivered. Even up the turn of the 20th century, antiquated techniques such as the pigeonhole method from colonial times were used for mail-handling. During the 1950's, the post office started intense research on the coding systems used in many other countries and started down the process of automation. In 1982, the first computer-driven, OCR machine got installed in Los Angeles, and by the end of 1984, over 250 OCRs machines were installed in 118 major mail processing centers across the country and were processing an average of 6,200 pieces of mail per hour.
![](https://prod-edxapp.edx-cdn.org/assets/courseware/v1/a672ff15c58d9672b9f5d2b427a20eb6/asset-v1:Microsoft+DAT210x+1T2018a+type@asset+block/M7L2_USPS.png)


Nowadays, the Postal Service is one of the world leaders in optical character recognition technology with machines reading nearly +98 percent of all hand-addressed letter mail and +99.5 percent of machine-printed mail, with a single tray sorting machines capable of sorting more than 18 million trays of mail per day.

Let's see if it is possible for you to train a support vector classifier on your computer in a few seconds using machine learning, and if your classification accuracy is similar or better than the advertised USPS stats. For this lab, you'll be making use of the Optical Recognition of Handwritten Digits dataset, provided courtesy of UCI's Machine Learning Repository.

- Fully review the starter code stored in Module6/Module6 - Lab2.ipynb. If you have any questions about it, please ask them on the forum before you submit your lab answers. The dataset for the lab is stored at /Module6/Datasets/optdigits.tes and /Module6/Datasets/optdigits.tra. Check out the official dataset page at the UCI ML Repository to figure out why there are two files.
- Make the requisite changes to get the project running, by providing the path to the .tes and .tra files.
- Train your SVC classifier with the parameters provided, and keep testing until you're able to beat the classification abilities of the USPS.
- Remember how important having a lot of samples is for machine learning? Try tossing out 96% of your samples, and see how it affects the accuracy of your highest accuracy support vector classifier.

------------------------------

Lab Assignment 3

Growing up, everyone has a hero. For many people, that hero was Muhammad Ali. He taught people it was okay to be proud of who they were, at a time when others would not accept that. He showed people how to stand up for their beliefs in the face of oppression and tyranny. He made people value themselves, and encouraged them care for those around them. He showed us what bravery truly meant, how to be a heck of a boxer, and so much more. Every single person who met Muhammad Ali, either in the ring or outside of it, had a motivating story to share about their encounter.

On June 3, 2016, Muhammad Ali passed away at the age of 74 due to septic shock. Thirty years earlier, he was diagnosed with Parkinson's syndrome, a neurodegenerative condition that doctors attributed to his boxing-related brain injuries.
![](https://prod-edxapp.edx-cdn.org/assets/courseware/v1/505c341c4239e7d684c4caf5614e367d/asset-v1:Microsoft+DAT210x+1T2018a+type@asset+block/M7L2_MuhammadAli.png)


Parkinson's disease itself is a long-term disorder of the nervous system that affects many aspects of a person's mobility over time. It's characterized by shaking, slowed movement, rigidity, dementia, and depression. In 2013, some 53 million people were diagnosed with it, mostly men. Other famous personalities affected by it include actor Michael J. Fox, and olympic cyclist Davis Phinney.

In this lab, you will be applying SVC to the Parkinson's Data Set, provided courtesy of UCI's Machine Learning Repository. The dataset was created at the University of Oxford, in collaboration with 10 medical centers around the US, along with Intel who developed the device used to record the primary features of the dataset: speech signals. Your goals for this assignment are first to see if it's possible to differentiate between people who have Parkinson's and who don't using SciKit-Learn's support vector classifier, and then to take a first-stab at a naive way of fine-tuning your parameters in an attempt to maximize the accuracy of your testing set.

"I've never really resented hard work because I've always liked it. Up every morning for roadwork. Going to the gymnasium every day at 12 o'clock. I never change my pattern."

In honor of Muhammad Ali and hard work, there is no starter code for this lab. Just follow the instructions below.

-----------------------

Lab Assignment 4

In this lab, you'll get started with decision trees by revisiting UCI's wheat-seeds dataset, so you can benchmark how long it takes to train and predict with decision trees relative to the speed of KNeighbors and SVC, as well as compare the decision boundary plots produced by it.

- No starter code this time. Instead, take your completed Module6/Module6 - Lab1.ipynb and modify it by adding in a Decision Tree Classifier, setting its max_depth to 9, and random_state=2, but not altering any other setting.
- Make sure you add in the benchmark and drawPlots call for our new classifier as well.

-------------------------

Lab Assignment 5

Mycology is a branch of biology that generally deals with the study of fungi and mushrooms, and particularly their genetic and biochemical make-up, and their use to humans. Throughout history, fungi have been used for tinder, medicine, and food. For hundreds of years, specific mushrooms have been used as folk medicine in Russian, China, and Japan. Scientists elsewhere have also documented many medicinal uses of mushrooms as well, but not all mushrooms are beneficial--some are quite deadly.

![](https://prod-edxapp.edx-cdn.org/assets/courseware/v1/15641a1802d294403454d1b8b5620469/asset-v1:Microsoft+DAT210x+1T2018a+type@asset+block/M7L4_Mushroom.jpg)


In this lab, you're going to use decision trees to peruse The Mushroom Data Set, drawn from the Audobon Society Field Guide to North American Mushrooms (1981). The data set details mushrooms described in terms of many physical characteristics, such as cap size and stalk length, along with a classification of poisonous or edible.

As a standard disclaimer, if you eat a random mushroom you find, you are doing so at your own risk. While every effort has been made to ensure that the information contained with the data set is correct, please understand that no one associated with this course accepts any responsibility or liability for errors, omissions or representations, expressed or implied, contained therein, or that might arise from you mistakenly identifying a mushroom. Exercise due caution and just take this lab as informational purposes only.

- First, visit the data set's page and read through it carefully. Understand what they're saying about missing value representations, and header names, and where the classification column is located. Peek through the data values in a spreadsheet program or text editor and get comfortable with it.
- Load up the started code in Module6/Module6 - Lab5.ipynb.
- A copy of the dataset is included in Module6/Datasets/agaricus-lepiota.data.
- You're going to need to review the decision tree code in the SciKit-Learn section of the Decision Tree section. It contains a few calls in there, necessary for the completion of the assignment. If you're unable to install graphiz, use webgraphviz, or alternative complete the assignment by examining the attributes of your classifier.

----------------------------

Lab Assignment 6

Human activity monitoring is a growing field within data science. It has practical use within the healthcare industry, particular with tracking the elderly to make sure they don't end up doing things which might cause them to hurt themselves. Governments are also very interested in it do that they can detect unusual crowd activities, perimeter breaches, or the identification of specific activities, such as loitering, littering, or fighting. Fitness apps also make use of activity monitoring to better estimate the amount of calories used by the body during a period of time.

In this lab, you will be training a random forest against a public domain Human Activity Dataset titled Wearable Computing: Accelerometers' Data Classification of Body Postures and Movements, containing 165,633, one of which is invalid. Within the dataset, there are five target activities:

- Sitting
- Sitting Down
- Standing
- Standing Up
- Walking

These activities were captured from four people wearing accelerometers mounted on their waist, left thigh, right arm, and right ankle. To get started:

- Acquire the DLA HAR Dataset from their webpage. Be sure to get the dataset-har-PUC-Rio-ugulino.zip file and not the weight lifting one. That's a bonus dataset you can try fitting afterwards! If the GroupWare website is down, we have a cached copy of the dataset in the course repo.
- Open up the sample code located in Module6/Module6 - Lab6.ipynb and read through it.
- Complete out all the requisite ToDo's as usual.
