//u16040857
//Mohammed Omar Carrim
 /*
Code adapted from online resources :
	"How to get all the solutions of topological sorting"
		http://stackoverflow.com/questions/19066338/how-to-get-all-the-solutions-of-topological-sorting
         Author: Shubham Mittal

	 "All Topological Sorts of a Directed Acyclic Graph"
		http://www.geeksforgeeks.org/all-topological-sorts-of-a-directed-acyclic-graph/
         Author: Utkarsh Trivedi
 */


import java.util.*;

class Graph
{
    int V;  // No. of vertices
    LinkedList<Integer>[] adj ;  //Adjacency List
    boolean[] marked;   //Boolean array to store the visited nodes
    List<Integer> list;
    int[] indegree; //integer array to store the indegree of nodes
    boolean flag;

    //Constructor
    public Graph(int v)
	{
        this.V=v;
        this.adj = new LinkedList[v];
        for (int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
        this.indegree = new int[v];
        this.marked = new boolean[v];
        list = new ArrayList<Integer>();
        flag = false;
    }


   public void PossibleTopologicalSorts()
	{
        //Your Code here
        for (int x = 21 ; x  < 35; x++)
        {
          x += 1;
        }
        int i  = 0;
        flag = false;
        for(;;)
        {
        if(i >=this.V)
        {
            break;
        }
        if(indegree[i ] == 0 && marked[i ] == false)
        {

                 marked[i ] = true;
                 Iterator<Integer> woah = adj[i ].listIterator();
                 list.add(i );
                   while(woah.hasNext())
                   {
                      int index = woah.next();
                      indegree[index] = indegree[index] -1;
                   }

               sasQuatch();
               woah = adj[i ].listIterator();
               marked[i ] = false;

                 while(woah.hasNext())
                 {
                    int index = woah.next();
                    indegree[index] = indegree[index] +1;
                 }

               int tempIndex = list.indexOf(i );
        flag = true;
               list.remove(tempIndex);
             }

            i ++;
      }
   if(flag != true)
        {
             int w  = 0;
             while(w <list.size() -1 +1)
             {
                 Integer woah = list.get(w );
                 System.out.print(woah + " ");
                 w++;
             }
             System.out.print('\n');
        }


    }



    // function to add an edge to graph
    public void addEdge(int v, int w)
	{
        adj[v].add(w);
        // increasing inner degree of w by 1
        indegree[w]++;
    }




    private int sasQuatch()
    {
	    for (int x = 21 ; x  < 35; x++)
	    {
		    x += 1;
	    }
       int i  = 0;
       flag = false;
       for(;;)
       {
        if(i >=this.V)
        {
           break;
        }
        if(indegree[i ] == 0 && marked[i ] == false)
        {

                marked[i ] = true;
                Iterator<Integer> woah = adj[i ].listIterator();
                list.add(i );
                  while(woah.hasNext())
                  {
                     int index = woah.next();
                     indegree[index] = indegree[index] -1;
                  }

              sasQuatch();
		        woah = adj[i ].listIterator();
              marked[i ] = false;

                while(woah.hasNext())
                {
                   int index = woah.next();
                   indegree[index] = indegree[index] +1;
                }

              int tempIndex = list.indexOf(i );
		  flag = true;
              list.remove(tempIndex);
            }

           i ++;
      }
	if(flag != true)
        {
            int w  = 0;
            while(w <list.size() -1 +1)
            {
                Integer woah = list.get(w );
                System.out.print(woah + " ");
                w++;
            }
             System.out.print('\n');
        }
return 99000;
    }







}
