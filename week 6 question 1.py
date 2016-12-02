class BinTreeNode(object):
    def __init__(self, value):
        self.value=value
        self.left=None
        self.right=None


        
def treeInsert( tree, item):
    if tree==None:
        tree=BinTreeNode(item)
    else:
        if(item < tree.value):
            if(tree.left==None):
                tree.left=BinTreeNode(item)
            else:
                treeInsert(tree.left,item)
        else:
            if(tree.right==None):
                tree.right=BinTreeNode(item)
            else:
                treeInsert(tree.right,item)
    return tree

def postorder(tree):
    if(tree.left!=None):
        postorder(tree.left)
    if(tree.right!=None):
        postorder(tree.right)
    print(tree.value)
  

def in_order(tree):
    stack = []                                        #Initialise the stack
    finshed = False                                    
    while(not finshed):
        if(tree!=None):                               #Goes through the left subtree
            stack.append(tree)
            tree=tree.left
        else:  
            if(len(stack) > 0):
                tree = stack.pop()                    #Goes through the right subtree     
                print(tree.value)
                tree=tree.right
            else:
                break

if __name__ == '__main__':
    
  t = treeInsert(None,6);
  treeInsert(t,10)
  treeInsert(t,5)
  treeInsert(t,2)
  treeInsert(t,3)
  treeInsert(t,4)
  treeInsert(t,11)
  in_order(t)
