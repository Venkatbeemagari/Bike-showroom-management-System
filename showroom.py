class Bike:
    def __init__(self,model,year,price):
        self.model=model
        self.year=year
        self.price=price
    
    def display(self):
        print(f"{self.model} ({self.year}): ${self.price}")
    
class Showroom:
    def __init__(self,name):
        self.name=name
        self.inventory=[]

    def add_bike(self,bike):
        self.inventory.append(bike)

    def display_inventory(self):
        print(f"{self.name} Inventory:")
        for i in self.inventory:
            i.display()
    

    def search_bike(self, model):
        for bike in self.inventory:
            if bike.model == model:
                bike.display()
                return
        print(f"No {model} found in {self.name} Inventory.")
    


bike1=Bike("mt15",2009,190000)
bike2=Bike("classic 350",2018,180000)
bike3=Bike("duke 390",2017,180000)

bike3.display()

showroom=Showroom("Showwroom")

showroom.add_bike(bike1)
showroom.add_bike(bike2)
showroom.add_bike(bike3)

showroom.display_inventory()
showroom.search_bike("mt15")
