class Animal
attr_accessor :name, :age, :trait
end

first_animal = Animal.new
first_animal.name = "Floyd"
first_animal.age = 93
first_animal.trait = "annoying"

puts first_animal.name
puts first_animal.age
puts first_animal.trait


