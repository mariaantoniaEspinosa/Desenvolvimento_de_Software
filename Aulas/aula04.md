```java
 public List<cadastroalunos.Aluno> leArquivo(){
        listaAluno.clear();

        try{
            arqW = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);

            String linha;

            while((linha = leitor.readLine()) != null){
                String [] campos = linha.split(";");

                String nome = campos[0];
                char sexo = campos [1].charAt(0);
                String idioma = campos[2];

                cadastroalunos.Aluno l = new cadastroalunos.Aluno(nome, sexo, idioma);

                listaAluno.add(l);
            }

            leitor.close();
            arqR.close();
        } catch (FileNotFoundException e ){
            System.out.println("Aquivo ainda não esxiste");
        } catch (IOExpcetion e){
            e.printStackTrace();
        }

        return listaAluno;
    }

    public List<Aluno> getListaAluno(){
        return listaAluno;
    }

    public void gravaArquivo(){
        try {
            arqW = new FileWritter(nomeArquivo + ".txt", false);
            escritor = new BufferedWritter(arqW);
            
            for(Aluno l : listaAluno){
                
                escritor.write(
                    l.nome + ";" +
                    l.sexo + ";" +
                    l.idioma
                );
                
                
                escritor.newLine();
            }
            
            escritor.close();
            arqW.close();
            
            System.out.println("Lista salva no arquivo");
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
```
