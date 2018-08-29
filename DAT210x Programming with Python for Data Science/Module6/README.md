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
