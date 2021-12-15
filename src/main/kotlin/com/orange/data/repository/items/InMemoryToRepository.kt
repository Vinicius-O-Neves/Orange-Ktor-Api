package com.orange.data.repository.items

import com.orange.data.model.FoodModel

class InMemoryToRepository: ItemsRepository {

    private val BASE_URL = "192.168.15.14:8140"

    private val items = listOf<FoodModel>(
        FoodModel(
            1,
            "Basic Burguer",
            "Burguer",
            "27",
            "Um delicioso lanche com um hambúrguer bovino de 180g, duas fatias de quejo cheddar, tomate, alface!! Uhmm acompanhado com um cesto de fritas.",
            "$BASE_URL/foodimages/basic_burguer_removebg.png",
            "$BASE_URL/foodimages/hand-in-burger-gloves-holding-beef-burger-in-black-background.jpg",
            "$BASE_URL/foodimages/big-cheeseburger-and-french-fries.jpg",
            "1"
        ),
        FoodModel(
            2,
            "Bacon Burguer",
            "Burguer",
            "33",
            "Um delicioso lanche com um hambúrguer bovino de 180g, duas fatias de quejo cheddar, tomate, alface, picles, cebola, maionese e fatias crocantes de bacon!! Uhmm acompanhado com um cesto de fritas.",
            "$BASE_URL/foodimages/bacon burguer.jpg",
            "$BASE_URL/foodimages/bacon burguer 1.jpg",
            "$BASE_URL/foodimages/bacon burguer 2.jpg",
            "1"
        ),
        FoodModel(
            3,
            "Super Bacon Burguer",
            "Burguer",
            "45",
            "Um delicioso lanche com dois hambúrgueres bovinos de 180g, três fatias de quejo cheddar, tomate, alface, picles, cebola, maionese e fatias crocantes de bacon!! Uhmm acompanhado com um cesto de fritas.",
            "$BASE_URL/foodimages/super_bacon_burguer-removebg.png",
            "$BASE_URL/foodimages/super bacon burguer.jpg",
            "$BASE_URL/foodimages/super bacon burguer 2.jpg",
            "1"
        ),
        FoodModel(
            4,
            "Chicken Burguer",
            "Burguer",
            "32",
            "Um delicioso lanche com um frango empanado de 180g, três fatias de quejo cheddar, tomate, alface, picles, cebola, muita maionese!! Uhmm acompanhado com um cesto de fritas.",
            "$BASE_URL/foodimages/chicken_burguer-removebg-preview.png",
            "$BASE_URL/foodimages/chicken burguer.jpg",
            "$BASE_URL/foodimages/chicken burguer 2.jpg",
            "1"
        ),
        FoodModel(
            5,
            "Juicy Noodles",
            "Pasta",
            "33",
            "Um delicioso prato de macarrão com muito molho de tomate e cubos de filé mignon.",
            "$BASE_URL/foodimages/pasta_removebg-preview.png",
            "$BASE_URL/foodimages/pasta-fettuccine-bolognese-with-tomato-sauce-in-white-bowl.jpg",
            "$BASE_URL/foodimages/penne-pasta-in-tomato-sauce-with-chicken-and-tomatoes-on-a-wooden-table.jpg",
            "2"
        ),
        FoodModel(
            6,
            "Conchiglione",
            "Pasta",
            "27",
            "Um delicioso prato de conchiglione com carne.",
            "$BASE_URL/foodimages/conchiglioni-removebg-preview.png",
            "$BASE_URL/foodimages/italian-pasta-conchiglioni-rigati-stuffed-with-meat.jpg",
            "$BASE_URL/foodimages/italian-pasta-conchiglioni-rigati-stuffed-with-meat 2.jpg",
            "2"
        ),
        FoodModel(
            7,
            "Pancakes",
            "Pasta",
            "34",
            "Deliciosas panquecas recheadas com carne e frango.",
            "$BASE_URL/foodimages/img_panqueca-removebg-preview.png",
            "$BASE_URL/foodimages/cute-pancakes-with-chicken.jpg",
            "$BASE_URL/foodimages/homemade-pancakes.jpg",
            "2"
        ),
        FoodModel(
            8,
            "Suco Natural de Laranja",
            "Drink",
            "8",
            "Um copo com 300ml suco de laranja 100% natural.",
            "$BASE_URL/foodimages/orange-juice-realistic-design-by-Vexels.svg",
            "$BASE_URL/foodimages/suco de laranja 1.jpg",
            "$BASE_URL/foodimages/suco de laranja 2.jpg",
            "1"
        ),
        FoodModel(
            9,
            "Coca Cola",
            "Drink",
            "6",
            "Coca Cola em lata de 350ml.",
            "$BASE_URL/foodimages/coca_cola_1-removebg-preview.png",
            "$BASE_URL/foodimages/coca cola 1.jpg",
            "",
            "1"
        ),
        FoodModel(
            10,
            "Guaraná Antarctica",
            "Drink",
            "6",
            "Guaraná Antarctica em lata de 350ml.",
            "$BASE_URL/foodimages/Guarana_Antarctica_Lata_1-removebg-preview.png",
            "$BASE_URL/foodimages/Guarana_Antarctica_Lata 1.jpg",
            "",
            "1"
        ),
        FoodModel(
            11,
            "Cerveja",
            "Drink",
            "14",
            "Caneca de cerveja com 420ml.",
            "$BASE_URL/foodimages/cerveja-removebg-preview.png",
            "$BASE_URL/foodimages/cerveja.jpg",
            "",
            "1"
        ),
        FoodModel(
            12,
            "Churros",
            "Dessert",
            "13",
            "Um delicioso churros com calda de chocolate e caramelo.",
            "$BASE_URL/foodimages/churros-removebg.png",
            "$BASE_URL/foodimages/churros.jpg",
            "$BASE_URL/foodimages/Churros_9-SQ.jpg",
            "2"
        ),
        FoodModel(
            13,
            "Banana Split",
            "Dessert",
            "23",
            "Uma deliciosa tigela de banana split com uma perfeita calda de chocolate  em cima de gigantes bolas de sorvete sabor creme e chocolate!",
            "$BASE_URL/foodimages/banana split removed background.jpg",
            "$BASE_URL/foodimages/banana split 1.jpg",
            "$BASE_URL/foodimages/banana split 2.jpg",
            "2"
        ),
        FoodModel(
            14,
            "Cup Cake",
            "Dessert",
            "16",
            "Um delicioso cup cake de chocolate rechedo com muita calda de chocolate meio amargo!",
            "$BASE_URL/foodimages/cup cake removed background.jpg",
            "$BASE_URL/foodimages/cup cake 1.jpg",
            "$BASE_URL/foodimages/cup cake 2.jpg",
            "1"
        )
    )

    override fun getAllItems(): List<FoodModel> {
        return items
    }

    override fun getItemById(id: Int): FoodModel? {
        return items.firstOrNull { it.id == id }
        }

    override fun getItemByCategory(category: String): List<FoodModel?> {
        return  items.filter { items -> items.category == category }
    }


}