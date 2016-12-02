class Vertex:
    def __init__(self):
        self.adjacent_edges = []

    def add_adjacent(self, node):
        self.adjacent_edges.append(node)                                            #Add the adjacent edges

class Graph(Vertex):
    def __init__(self):
        self.node_dict = {}                                                         #Graph vertices are the keys with the values being corresponding edges

    def add_node(self, vertex):                                                     
        new_node =  Vertex()                                                        #Create a Vertex object      
        self.node_dict.setdefault(vertex, list()).append(new_node.adjacent_edges)   #Create a new value with a missing key or gets the value associated with a key 
        return new_node


    def add_edge(self, node1, node2):
        self.add_node(node1).add_adjacent(node2)                                    #Adjacent node added
        self.add_node(node2).add_adjacent(node1)


    def dfs(self, start):
        visited = []
        stack = [start]
        while len(stack) > 0:                                                       #Stops the operation when stack is empty
            node = stack.pop()                                                      #Removes the last element in the stack and visits it
            if node not in visited:
                visited.append(node)                                                #Makes sure no repeat of the same node visited
                for v in self.node_dict.get(node):
                   if v !=[]:
                        stack.extend(v)                                             #Adds all adjacent nodes into the stack
        f = open("depthTraversal.txt", "w")
        f.write(str(visited))
        f.close()
        return visited

    def bfs(self, start):
        visited = []
        queue = [start]                                                             #Queue is the order of vertices to visit
        while len(queue) > 0:                                                       #Stops the operation when queue is empty
            node = queue.pop(0)                                                     #Removes the first element in the queue and visits it
            if node not in visited:
                visited.append(node)                                                #Makes sure no repeat of the same node visited
                for v in self.node_dict.get(node):                                      
                   if v !=[]:                                                       #Ensures a node is added into the queue 
                        queue.extend(v)                                             #Adds all adjacent nodes into the queue
        file = open("breadthTraversal.txt", "w")
        file.write(str(visited))
        file.close()
        return visited

                                                                                            

if __name__ == '__main__':

    g = Graph()
    g.add_node('a')
    g.add_node('b')
    g.add_node('c')
    g.add_node('d')
    g.add_node('e')
    g.add_node('f')
    g.add_edge('a', 'e')  
    g.add_edge('a', 'c')
    g.add_edge('b', 'a')
    g.add_edge('b', 'c')
    g.add_edge('c', 'd')
    g.add_edge('c', 'f')
    g.add_edge('d', 'e')
    g.add_edge('e', 'b')
    g.add_edge('f', 'd')
    g.dfs("a")
    g.bfs('a')
