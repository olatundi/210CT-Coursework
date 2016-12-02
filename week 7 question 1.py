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
    
