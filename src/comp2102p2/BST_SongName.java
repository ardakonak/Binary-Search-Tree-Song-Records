/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102p2;

/**
 *
 * @author ardakonak
 */
public class BST_SongName {
    
     Song root;
    
    public BST_SongName() {
        root = null;
    }

public void addNode(String songName, String artist, int id, String genre, int year) {
    Song n = new Song(songName,artist,id,genre,year);
    if (root == null) {
            root = n;
        } else {
            Song tmp = root;
            Song parent = root;
    
    while (tmp!= null){
        parent = tmp;
        if(id<tmp.id){
            tmp = tmp.left;
        } else if (id>tmp.id){
            tmp = tmp.right;
        }
    }
    if(id<parent.id){
        parent.left = n;
    } else {
        parent.right = n;
    }
   }
  }

public void traverseInOrder(Song focus) {
        if (focus.left != null) {
            traverseInOrder(focus.left);
        }
        System.out.println(focus);
        if (focus.right != null) {
            traverseInOrder(focus.right);
        }
    }

public Song searchRecursive(Song focus, String key) {
        
        if (focus == null) {
            return null;
        }
        if (focus.songName.equalsIgnoreCase(key)) 
        {
            return focus;
            
        } 
        while(focus.left != null){
            return searchRecursive(focus.left, key);
         
        }
        while(focus.right!= null){
            return searchRecursive(focus.right, key);
        
        }
        return focus;
                }

public Song search(String key) {
        return searchRecursive(this.root, key);
    }

    
}
