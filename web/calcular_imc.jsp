<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Avaliar Aluno :: Aplicação Teste Funcional</title>
    </head>
    <body>
        <font face="tahoma">
            <h1>Calcular Imc</h1>
            <form action="ServletControllerWeb" method="post" name="frmCadastroAluno" onsubmit="return validaFormularioCadastro()">
                <table>
                    <tr>
                        <td>Sexo:</td><td>
                            <select name="vSexo">
                                <option>-</option>
                                <option value="M">Masculino</option>
                                <option value="F">Feminino</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Peso:</td><td><input type="text" name="vPeso" size="30"></td>
                    </tr>            
                    <tr>
                        <td>Altura:</td><td><input type="text" name="vAltura" size="30"></td>
                    </tr>            
                           
                    <tr>
                        <INPUT size="3" type="Hidden" name="vOP" value="0">
                        <td></td><td><input type="submit" name="Enviar" value="Enviar"></td>
                    </tr>               
                </table>
            </form>
            <br><br> <br><a href="index.jsp" >Voltar</a><br>
        </font>
        <SCRIPT language="JavaScript">
            <!--
    
            function validaFormularioCadastro() { 
                frm = document.frmCadastroAluno;
                var vMensagem;
                var vInconsistente;
                var vRequeridos;
                vMensagem = "";
                vRequeridos = 0;
                
                if (frm.vPeso.value === ""){
                    vMensagem = "Informe o Peso.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vPeso.focus();
                }                             
                if (frm.vAltura.value === ""){
                    vMensagem = "Informe a Altura.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vAltura.focus();
                }             
                if (frm.vSexo.value === ""){
                    vMensagem = "Informe o Sexo.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vSexo.focus();
                }                  
                if (vRequeridos === 1){
                    vMensagem = ""+vMensagem;
                }
                
                if (vMensagem === ""){
                    return true;
                }else{
                    alert(vMensagem);
                    return false;
                }                
            } 
    
    
            //-->
        </SCRIPT>        
    </body>
</html>
