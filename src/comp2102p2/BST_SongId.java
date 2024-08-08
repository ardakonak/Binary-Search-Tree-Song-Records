/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102p2;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/**
 *
 * @author ardakonak
 */
public class BST_SongId {
    
    Song root;
    
    public BST_SongId() {
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

public Song searchRecursive(Song focus, int key) {
        
        if (focus == null) {
            return null;
        }
        if (focus.id == key) 
        {
            return focus;
            
        } else if (key < focus.id) 
        {
            return searchRecursive(focus.left, key);
        } else 
        {
            return searchRecursive(focus.right, key);
        }
    }

public Song search(int key) {
        return searchRecursive(this.root, key);
    }


public String searchInterval(int minkey, int maxkey) {
    
    for(int i = minkey; i<=maxkey; i++){
        if(search(i) != null)
        System.out.println(search(i));
    }
        return "These are the songs with id between " + minkey + " and " + maxkey ;
      
   
} 
public Song searchInterval2(int minkey, int maxkey){
    int i = 0;
    while (i < minkey){
        return search(i);
    }
    return search(maxkey);
}


public Song delete(Song focus, int key) {
        if (focus == null) {
            return null;
        }
        if (key < focus.id) {
            focus.left = delete(focus.left, key);
        } else if (key > focus.id) {
            focus.right = delete(focus.right, key);
        } else {
            if (focus.right == null) {
                return focus.left;
            }
            if (focus.left == null) {
                return focus.right;
            }
            Song t = focus;
            focus = min(t.right);  
            focus.right = deleteMin(t.right);
            focus.left = t.left;
        }
        return focus;
    }

public Song min(Song x) {
        if (root == null) {
            throw new NoSuchElementException("BST is empty!");
        }
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }

public Song deleteMin(Song a) {
        if (root == null) {
            throw new NoSuchElementException("BST is empty!");
        }
        if (a.left == null) {
            return a.right;
        }
        a.left = deleteMin(a.left);
        return a;
}



}