# Wasteless


WasteLess is a household resource tracking app designed to help users manage their food and household supplies, monitor expiry dates, reduce waste, and make smarter purchasing decisions.

The project is being developed using Android Studio, with a focus on inventory management, waste tracking, and data driven insights to help users understand their consumption habits.


This project follows a structured development timeline, covering initial planning, UI/UX design, development, quality assurance, testing, and launch. The goal is to build a functional application while documenting the development process and learning along the way.
<img width="1654" height="860" alt="Graph date time frame" src="https://github.com/user-attachments/assets/e0f5eb36-6de1-43bb-9eb8-34d50b005f63" />


The project will follow a structured eight-week development timeline:


Week 1 – Business Analysis: Define the problem, identify user needs, establish project objectives, and outline the core features.


Week 2 – UI/UX Design: Plan the application layout, user flows, and interface designs before implementation.


Weeks 3–6 – Development: Build the Android application, implement its core features, and develop the inventory tracking and data insights functionality.


Weeks 7–8 – QA & Debugging: Test the application, identify and resolve bugs, validate functionality, and refine the overall user experience.


Final Day – Launch: Prepare the final release, document the outcome, and review the project's achievements and lessons learned.


## Business Analysis
In the Uk, food is wasted approximately 9.52 tonnes of food every year, the followed includes:

Unfinished food from plates.
Expired or spoiled food.
Trimmed or peeling waste,

This apps goal is to minimise the amount of waste you generate within your household by creating stats on the specific food you have made and showcases all food you have in your phone instead of leaving the chicken at the back of the fridge where no one can see.

So the main features shall include:
A list of all your food, grouped in each “Location”
A location would mean fridge or a freezer (you can add more locations if you need)
A shopping list
The front page shows what expires first for example.
And a stats page which introduces everything you know about your waste habits from the type of food you waste the most to a comparison showcasing the food you used vs the food you wasted

To beat competitors the two main features would include
A stats page which in most apps would be a paywall if they would add one 
And recommendations where you would be recommended food recipes based on some of the food which are soon to be expired


The users shouldn’t pay to see what they are mostly wasting, I am sure they don't want to pay just to see what they are wasting unless they are very environmentally friendly so I the hope is that most people can use this for there own benefit as there shouldn;t be a catch as it then feels like there is more subscriptions which add on other time.


## App design


### Home Screen
<img width="377" height="915" alt="image" src="https://github.com/user-attachments/assets/22e9b028-6c0d-4cd1-a4c6-bef231a0b8f5" /> <img width="377" height="725" alt="image" src="https://github.com/user-attachments/assets/9996eefd-1d09-4011-a2cd-5581881832d4" />


The Initial designo the right look way to cluttered, it makes it feel like its more like a cooking app rather than a food tracker so I decided to feel the screen with the bigger image of the recipies so it makes it look more minimalisti and sleek.


The concept on the left was the final concept idea. At the top are your 'Locations' where you can swipe through them all, there should be images of them, the plan is that it should be a short cut to see all your items from the 'fridge' if you are hovering from there. The expiring soon would be the all the food which is  expiring, it should be sorted in order where the food which is going to expire first would sit on the front of the list and so on and so foruth; With finally the Reccomended recipes which should be an API which searches a site which contains 'Chicken' or 'Spring onion' and provides a reccomendation on what to make with the food which will soon expire.




### My Items
<img width="651" height="759" alt="image" src="https://github.com/user-attachments/assets/cf92cce2-7a69-4a2c-ad8a-78672534077d" />


The my items page will showcase all locations shown, at the bootm it says that you can add more or you can go on the top right corner of the location and click the 3 lines, this should give you options to rename, change image or even delete it, there would be a warning popup mentioning that if you delete it, you would delete every item within it.

Clicking onto 'fridge' for example you would be shown the list of all the items you have; There should be a sort by feature  a search feature to look for a specific item and a add button if you want to add a item to this location.


<img width="1098" height="942" alt="image" src="https://github.com/user-attachments/assets/57605f9f-1774-42e8-85b1-998a1555b663" />


There are 3 different pop ups. The first one is when you click the item as shown above. You can eddit the already existing item with the option of quantity type, unitsor other, units is used when you have food you can actually measure, this could help if I wanted to dive deeper into the stats on KG/Litres wasted but I just wanted the option either way, the other button is used when you can't measure the item also used for people like me where you have so much shopping and you dont want to spend all your time on looking for weight and units, people are busy and that shouldn't be used just to make it feel like another task/job it should be quick and easy but the unit option is available for other people if they need it. There will also be a finished and wasted button this will be used when the item is either spoiled or used up and will be counted towards your stats.


Finally the add button. It is the same lay out of the edit button but I thought a added preview button would look pretty cool in my opinion so I added that too.


### Shopping
<img width="365" height="831" alt="image" src="https://github.com/user-attachments/assets/833f8820-9b9a-477c-9758-a916e8364a25" />


Treat this as a whishlist rather than an actual existing list like your 'My Items' Page, this is used to keep track of food you need for your home you can pre add the items and the location it would be in and once you have obtained the item you can move it from your wish list to inventory. Adding an item would be the same as the previous page but with the option to choose which location to get it from.


I thought the page looked empty so I decided to add another reccomended for you where it uses the shopping list and showcases items you can make based on that and potentially your expiring food aswell.

### Insights
<img width="997" height="706" alt="image" src="https://github.com/user-attachments/assets/018f2fcd-672b-4477-a96e-814d30140883" />


The Stats or insights page is the main page you go to when you want to know everything about your stats! The aim is to make one of the graphs but if this was full development there would be 3 graphs, the bar chart will showcase the amount of food wasted per month/week with underneath being your most wasted food during that month/week with a view all showing the most to the least most amount of items expiring. The next one is the pie chart, It would break it down into food groups show casing a chart of most wasted food category with the final graph being a line graph comparing the used and wasted showing some extra stat facts underneath with the total items bought wasted and used at the top of the screen. the green circle would be a leaf, red circle for a bin and a backet for bought. I am only aiming to do the mon fileter only but if I have extra time then I would aim for the week.



## Development

## Quality Assurance and Debugging
