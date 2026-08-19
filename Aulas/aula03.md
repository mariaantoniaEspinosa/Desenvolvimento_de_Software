# Componentes do JAVA SWING 
## Text Area - txaText
- Neste componente conseguimos mudar a quantidade de colunas e linhas e ir adicionando textos dentro dele.
- Funciona da mesma forma que o componente TextField
```java
  txa.Resultado.setTexto("escrita do texto");
```
- No exemplo é usado o método **.append**, o qual serve para adicionar e concatenar textos no final de algo que já existe
```java
  txaTexto.append(txtMensagem.getText()+"\n");
  txtMensagem.setText(""); //usado para limpar o textField
``` 
## RadioButton e ButtonGroup
- Usado para permitir que os usuários escolham uma única opção de um conjunto pré-definido de opções mutuamente exclusivas
- apenas adicionar dois RadioButton não faz com que apenas uma opçõa possa ser escolhida é necessario adicionar um ButtonGroup, que não ficará visivel no formulario, e depois ir nas propiedades de cada RadioButton e selecionar o ButtonGroup criado.
```java
          if(radMasculino.isSelected()){
              sexo = 'M';
              JOptionPane.showMessageDialog(null, "Sexo selecionado:"+sexo, "Aleta!!!",
JOptionPane.INFORMATION_MESSAGE);
          }else if(radFeminino.isSelected()){
              sexo = 'F';
             JOptionPane.showMessageDialog(null, "Sexo selecionado:"+sexo, "Aleta!!!", JOptionPane.INFORMATION_MESSAGE);
          }else{
             JOptionPane.showMessageDialog(null, "Selecione um sexo", "Erro!!!", JOptionPane.ERROR_MESSAGE);
          }
          
```
- declarar variável global  "sexo";
- método **isSelected()** é utilizado por componentes que podem ser "selecionados", retorna um valor boolean
## CheckBox (chk)
- permite ao usuário selecionar ou desmarcar uma ou mais opções de um conjunto de opções independentes
- utilizado quando deseja-se que o usuário tenha a capacidade de escolher várias opções dentre várias disponíveis
```java
        if(chkTecnologia.isSelected()){
            tecnologia = true;
        }else{
            tecnologia = false; // para o caso de deselecionar
        }
         if(chkAstronomia.isSelected()){
            astronomia = true;
        }else{
            astronomia = false; // para o caso de deselecionar
        }
          if(chkEsportes.isSelected()){
            esportes = true;
        }else{
            esportes = false; // para o caso de deselecionar
        }
        JOptionPane.showMessageDialog(null, "Tecnologia: "+tecnologia+"\nAstronomia: "+astronomia+"\nEsportes: "+esportes,"Alerta!!" , JOptionPane.INFORMATION_MESSAGE);      
```
## Combo Box (cmb)
- combina uma caixa de texto editável com uma lista suspensa de opções selecionáveis
- usadas para permitir que o usuário escolha uma opção entre várias em um menu suspenso ou insiram um valor personalizado por meio de uma caixa de texto
- para adicionar quais serão as opções disponíveis ➔ clicar com botão direito em cima do combo box e abrir as propiedades e então modificar a model
## JTable (tbl)
- exibe dados em forma de tabela
- permite a criação e exibição de tabelas de dados, semelhante a planilha ou aplicativo de banco de dados
- é altamente personalizável e oferece suporte para uma ampla gama de recursos, como ordenação, seleção de células, edição de células, ...
- para modificar a quantidade e o nome das colunas ➔ clicar com botão direito em cima da JTabel e abrir as propiedades e então modificar a model
- **criar nova classe dentro do mesmo projeto e inserir:**
```java
    public class Pessoa {
        public String nome;
        public char sexo;
        public String idioma;

    public Pessoa(String nome, char sexo, String idioma) {
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }
    
    public Object[] obterDados(){
        return new Object[]{nome,sexo,idioma};   
    }
  }
```
-**dentro do código:**
```java
        Pessoa p = new Pessoa(txtNome.getText(),sexo,(String)cmbIdioma.getSelectedItem());
        DefaultTableModel tabela = (DefaultTableModel) tblTabela.getModel();
        tabela.addRow(p.obterDados());
````
