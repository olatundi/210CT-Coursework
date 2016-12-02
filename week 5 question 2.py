class Node(object):
  def __init__(self, value):
      self.value = value                        #The data item stored by the node
      self.next = None                          #Pointer to the next node in the list
      self.prev = None                          #Pointer to the previous node in the list.

class List(object):
  def __init__(self):
      self.head = None                          #First item is the "head“
      self.tail = None                          #Last item is the "tail"
  def insert(self,n,x):
      if n != None:                         
          x.next = n.next
          n.next = x
          x.prev = n
          if x.next != None:
              x.next.prev = x              
      if self.head == None:
          self.head = self.tail = x
          x.prev = x.next = None
      elif self.tail == n:
          self.tail = x
  def delete(self,n):
      if n.prev != None:
          n.prev.next = n.next
      else:
          self.head = n.next
      if n.next != None:
          n.next.prev = n.prev
      else:
          self.tail = n.prev
  def display(self):
      values = []
      n = self.head
      while n != None:
          values.append(str(n.value))
          n = n.next
      print("List:",",".join(values))
     
if __name__ == '__main__':
  l=List()
  l.insert(None, Node(5))
  l.insert(l.head, Node(3))
  l.insert(l.head, Node(4))
  l.insert(l.head, Node(7))
  l.insert(l.head, Node(9))
  l.delete(l.tail)
  l.display()
