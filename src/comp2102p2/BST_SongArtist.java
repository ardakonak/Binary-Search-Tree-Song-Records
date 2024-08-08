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
public class BST_SongArtist {
     Song root;
    
    public BST_SongArtist() {
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
        if (focus.artist.equalsIgnoreCase(key)) 
        {
            return focus;
            
        } 
        else {
        while(focus.left != null){
            return searchRecursive(focus.left, key);
         
        }
        while(focus.right!= null){
            return searchRecursive(focus.right, key);
        
        }
        }
        return null;
                }

/*public Song searchRecursive2(Song focus, String key){
     
        if (focus.artist == key) 
        {
            return focus;            
        } else {
        for(int i = focus.id + 1; i<1021; i++){
        }
        }
        return focus;
} */
/*public Song search2(String key) {
        return searchRecursive2(this.root, key);
    } */


public Song search(String key) {
        return searchRecursive(this.root, key);
    }

   
}
