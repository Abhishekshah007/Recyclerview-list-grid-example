# Recyclerview-list-grid-example

Rough Documentation


=> Problem Statement:
          
            -Create a list of students and show it in the list.Show the student's Name and profile picture in the list
             Add two buttons named "List" and "Grid". Clicking on the List button, show the student list in a vertical single-item list, 
             and Clicking on the Grid button, show the student list in 2 cell grid view.
            
            
=> Language And Main Concepts:

      -Lang:
            - Java
            - XML
      -Concepts:
            - Recycler
            - Adapter
            - ViewHolder
            - Conditinal
            - Binding
            
            
=> Approach And Solution:

           Design:  Ok, so after reading the problem statement, we can clearly see that we need to add two xml files, one for list view and the other for grid view,
           so first I create a new project and add recycler view to Gradle, and then I open the main xml file and add two buttons for grid and list, and after that
           we created two separate layouts, and inside those layouts, I added all the required design as stated in the problem statement.
           
           Coding: Now, for the logic part, we need to create a class within the main activity that has two arguments, one for the name and the other for the profile
           image, and then we need to create a new file or adapter that holds all the logic that allows us to show the data on the activity, so inside the adapter
           file, I initialise the recycler view, then I connect the student class from the main file, then I added a create viewHolder method so that he can choose
           which one is needed to show.
           
           Then I used Bind view holder so that he could bind those data and also store it reference so that he didn't have to call findById again and again, and
           finally I added view holder which plotted data on activity, so now we move to the main file where we have initialised or connected the adapter file, and we
           also need an array which stores images so that we can dynamically get image id's which are stored in the drawble directory. 
           
           
