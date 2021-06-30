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
            <h1>Cadastrar Aluno</h1>
            <form action="ServletControllerWeb" method="post" name="frmCadastroAluno" onsubmit="return validaFormularioCadastro()">
                <table>
                    <tr>
                        <td>Nome:</td><td><input type="text" name="vNome" size="40"></td>
                    </tr>
                    <tr>
                        <td>Idade:</td><td><input type="text" name="vIdade" size="40"></td>
                    </tr>            
                    <tr>
                        <td>Matricula:</td><td><input type="text" name="vMatricula" size="40"></td>
                    </tr>            
                    <tr>
                        <td>Nota 1:</td><td><input type="text" name="vNota1" size="40"></td>
                    </tr>            
                    <tr>
                        <td>Nota 2:</td><td><input type="text" name="vNota2" size="40"></td>
                    </tr>            
                    <tr>
                        <td>Nota Final:</td><td><input type="text" name="vNotaFinal" size="40"></td>
                    </tr>    
                    <tr>
                        <td>Freqüencia:</td><td><input type="text" name="vFrequencia" size="40"></td>
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
                
                if (frm.vFrequencia.value == ""){
                    vMensagem = "Informe a Frequencia do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vFrequencia.focus();
                }                             
                if (frm.vNota2.value == ""){
                    vMensagem = "Informe a Nota2 do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vNota2.focus();
                }             
                if (frm.vNota1.value == ""){
                    vMensagem = "Informe a Nota1 do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vNota1.focus();
                }                  
                if (frm.vMatricula.value == ""){
                    vMensagem = "Informe a Matricula do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vMatricula.focus();
                }                  
                if (frm.vIdade.value == ""){
                    vMensagem = "Informe a Idade do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vIdade.focus();
                }                
                if (frm.vNome.value == ""){
                    vMensagem = "Informe o Nome do Aluno.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vNome.focus();
                }	
                if (vRequeridos == 1){
                    vMensagem = ""+vMensagem;
                }
                
                if (vMensagem == ""){
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
