<#--<script type="text/javascript">-->
<#--    $(document).ready(function () {-->
<#--        $(".deleteFromBasket").click(function (event) {-->
<#--            var id = $(this).attr('value');-->

<#--            function deleteProductFromBasket(id) {-->

<#--                $.ajax({-->
<#--                    type: "POST",-->
<#--                    url: "/deleteFromBasket",-->
<#--                    contentType: 'application/json',-->
<#--                    dataType: 'text',-->
<#--                    data: id,-->
<#--                    success: function (data) {-->
<#--                        console.log("Succes!")-->
<#--                    }-->
<#--                });-->
<#--            }-->

<#--            deleteProductFromBasket(id);-->
<#--            -->
<#--            getBasketContent();-->
<#--        })-->

<#--    });-->



<#--</script>-->

<script>
    $(document).ready(function () {

        $(".deleteFromBasket").click(function (event) {
            var id = $(this).attr('value');
            // alert(id);

            // $( this ).animate({
            //     width: "70%",
            //     opacity: 0.4,
            //     borderWidth: "10px"
            // }, 1500 );

            function deleteProduct(id) {
                $.ajax({
                    type: "POST",
                    url: "/deleteFromBasket",
                    contentType: 'application/json',
                    dataType: 'text',
                    data: id,
                    success: function (data) {
                        console.log("Succes!")

                    }
                });

                getBasketContent();
            }

            deleteProduct(id);
        })

    });
</script>

<#list products as product>
    <div class="row justify-content-center" id="basketRow">
            <span class="col-4 align-self-center"><img id="imageLaptopBasket"
                                                       src="${product.getPhoto()[0].getLocation()}"></span>
        <span class="col-2 align-self-center">${product.getLaptopManufacturer().getValue()}</span>
        <span class="col-3 align-self-center">${product.getModel()}</span>
        <span class="col-1 align-self-center">${product.getPrice()} UAH</span>
        <span class="col-2 align-self-center">
                <button class="btn btn-danger deleteFromBasket" value="${product.getId()}">Удалить</button>
            </span>
    </div>
</#list>

<div class="row" id="basketRowLast">
    <span class="col-4 align-self-center"></span>
    <span class="col-2 align-self-center"></span>
    <span class="col-3 align-self-center">СУММА: </span>
    <span class="col-1 align-self-center">${totalPrice} UAH</span>
    <span class="col-2 align-self-center"><button class="btn btn-success">Оплатить</button></span>
</div>