class person:
   def __init__(self,name,age):
       self.name = name
       self.age = age
   def introduce(self):
       print(f"hello, my name is {self.name} and i am {self.age} years old.")
person1 = person("alice",30)
person2= person("bob",25)

person1.introduce()
person2.introduce()
