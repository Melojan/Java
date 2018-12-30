/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
enum Side {
    NONE,RIGHT,LEFT;
}
public class ChainLink {
    
    // Initialize the right,left,middle chainlinks
    // Initialize the numberoflinks same as the size that corresponds to the chainlinks
    // append method should be the same as the insert method in BST
   
    private static ChainLink chainlink;
    private ChainLink leftChain;
    private ChainLink rightChain;
    private String data;
    
    public ChainLink()
    {
        this.leftChain = leftChain;
        this.rightChain = rightChain;
        this.data = data;
    }
    
    public ChainLink getLeftChain()
    {
        return leftChain;
    }
    
    public ChainLink getRightChain()
    {
        return rightChain;
    }
    
    public String getData()
    {
        return data;
    }
    
    public int numOfLinks(ChainLink link)
    {
        if(link == null)
        {
            return 0;
        }
        else if(link.leftChain == null && link.rightChain == null)
        {
            if(link != null && !link.getData().equals("NONE"))
            {
                return 1;
            }
            else if(link.getData().equals(null))
            {
                return 0;
            }
        }
        else if(link.leftChain != null)
        {
            return numOfLinks(link.leftChain) + 1;
        }
        else if(link.rightChain != null)
        {
            return numOfLinks(link.rightChain) + 1;
        }
        
        return 0;
    
    }
    
    public void append(ChainLink rightPart)
    {
        if(this.rightChain != null)
        {
            throw new IllegalStateException("Link is already connected");
        }
        
        this.rightChain = rightPart;
        rightPart.leftChain = this;
    }
    
    public int count(ChainLink link)
    {
        return chainlink.numOfLinks(chainlink.getLeftChain());
    }
    
    public static void main(String [] args)
    {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();
        left.append(middle);
        middle.append(right);
        System.out.println(left.count(left));
        
    }

}
