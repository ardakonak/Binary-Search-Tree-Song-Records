/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;



/**
 *
 * @author ardakonak
 */
public class BST_Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws NoSuchElementException, FileNotFoundException, IOException {               
        
        BST_SongId testtreeId = new BST_SongId();
        BST_SongArtist testtreeArtist = new BST_SongArtist();
        BST_SongName testtreesongName = new BST_SongName();
        BST_SongGenre testtreeGenre = new BST_SongGenre();
        
        File songs = new File("/Users/ardakonak/Desktop/songrecords.txt");
        Scanner input = new Scanner(songs);
        Scanner user = new Scanner(System.in);
         
         
        System.out.println("WELCOME TO THE RECORD SYSTEM: Please choose an action: ");
        System.out.println("1 = Search a song by Id ");
        System.out.println("2 = Search a song by Artist");
        System.out.println("3 = Search a song by Song Name");
        System.out.println("4 = Search ranges with Song Id's ");
        System.out.println("5 = Delete a song by Id ");
        System.out.println("6 = Insert a new Song ");  
        System.out.println("7 = Show the whole Record List ");
        System.out.println("8 = Show all songs from a genre");
        int enteredaction = user.nextInt();
        
        switch (enteredaction) {
        
            case 1:
                
            while (input.hasNext()){
        
           /*System.out.println(input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.nextInt()); */
           testtreeId.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
           
       
        }
        input.close();
             System.out.println("Enter the id of the song: ");
             int enteredid = user.nextInt();
             System.out.println(testtreeId.search(enteredid));
             break;
             
            case 2:
                
            while (input.hasNext()){
           
           testtreeArtist.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
           
        }
        input.close();
        
            
             /*testtreeArtist.traverseInOrder(testtreeArtist.root);
             System.out.println(testtreeArtist.search("ahmet")); */
             
             System.out.println("Enter the Artist of the song: ");
             String enteredArtist = user.next();
             System.out.println(enteredArtist);
             System.out.println(testtreeArtist.search(enteredArtist));
             break;
             
            case 3:
                
            while (input.hasNext()){
                
           testtreesongName.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();
             System.out.println("Enter the Name of the song: ");
             String enteredName = user.next();
             System.out.println(testtreesongName.search(enteredName));
             break;
             
            case 4:
                
                while (input.hasNext()){
                
           testtreeId.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();
             System.out.println("Enter the minimum id for the interval: ");
             int minimumid = user.nextInt();
             System.out.println("Enter the maximum id for the interval: ");
             int maximumid = user.nextInt();
             System.out.println(testtreeId.searchInterval(minimumid, maximumid));
             break;
             
            case 5:
                
                while (input.hasNext()){
                
           testtreeId.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();

             System.out.println("Enter the Id of the song to delete: ");
             int deleteid = user.nextInt();
             System.out.println("Removing the song with Id: " + deleteid);
             testtreeId.delete(testtreeId.root, deleteid);
             System.out.println("==================================================== ");            
             System.out.println("After the deletion here is the new version of the list: ");
             testtreeId.traverseInOrder(testtreeId.root);
             break;
             
            case 6:
                
                while (input.hasNext()){
                
           testtreeId.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();
             System.out.println("Enter the Name of the Song: ");
             String name = user.next();
             System.out.println("Enter the Artist of the Song: ");
             String artist = user.next();
             System.out.println("Enter the Id of the Song: ");
             int idsong = user.nextInt();
             System.out.println("Enter the Genre of the Song: ");
             String genresong = user.next();
             System.out.println("Enter the Year of the Song: ");
             int yearsong = user.nextInt();
             System.out.println("Insertıng the song you entered....");
             testtreeId.addNode(name, artist, idsong, genresong, yearsong);
             System.out.println("==================================================== ");  
             System.out.println("After the insertion here is the new version of the list: ");
             testtreeId.traverseInOrder(testtreeId.root);
             break;
             
            case 7: 
                
                while (input.hasNext()){
                
           testtreeId.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();
        System.out.println("Here is the Full List: ");
        testtreeId.traverseInOrder(testtreeId.root);
        
        
             case 8:
                
        while (input.hasNext()){
                
           testtreeGenre.addNode(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
        }
        input.close();
                System.out.println("Enter the genre you want to look up: ");
                String genreType = user.next();
                System.out.println("Here is the Full List: ");
                System.out.println(testtreeGenre.search(genreType));
                break;
        }

    }

}
