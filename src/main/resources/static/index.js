const testPostButton = document.getElementById("test-post-button");
const testGetButton = document.getElementById("test-get-button");
const productPostButton = document.getElementById("product-post-button");
const productGetButton = document.getElementById("product-get-button");

//------------------------------------------------------------------------------------

testPostButton.addEventListener("click", e => {
    e.preventDefault();
    console.log("boe");
    testPost()
        .then(res => console.log("test post placed " + res))
        .catch(rej => console.log("test post failed " + rej));
});

testGetButton.addEventListener("click", e => {
    e.preventDefault();
    console.log("boe");
    testGet()
        .then(res => console.log("test retrieved " + res))
        .catch(rej => console.log("test retrieve failed " + rej));
});


productGetButton.addEventListener("click", e => {
    e.preventDefault();
    console.log("boe");
    productGet()
        .then(res => console.log("product retrieved " + res))
        .catch(rej => console.log("product retrieve failed " + rej));
});

productPostButton.addEventListener("click", e => {
    e.preventDefault();
    console.log("boe");
    productPost()
        .then(res => console.log("product post placed " + res))
        .catch(rej => console.log("product post failed " + rej));
});

//-----------------------------------------------------------------------

async function testPost() {
    await fetch("api/test", {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: '{"value": "test"}'
    });
}

async function testGet() {
    console.log("testGet");
    const a = await fetch("api/test");
    const json = await a.json();
    console.log(JSON.stringify(json));
}

function makeProduct() {
    return {
        name: "Product Name",
        items: [
            {
                available: true
            },
            {
                available: false
            }
            // Add more items as needed
        ]
    };

}

const product = {
    name: "Product name",
    items: []
}

const items = {
    available: true
}

product.items.push(items);


async function productPost() {
    console.log(JSON.stringify(product));
    console.log(JSON.stringify(makeProduct()));
    await fetch("api/product", {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(product)
        //body: JSON.stringify(makeProduct())
    });
}

async function productGet() {
    const a = await fetch("api/product");
    const json = await a.json();
    console.log(JSON.stringify(json));
}




