:: 1. Abrir o Prompt de Comando (CMD)
:: Pressione Win + R, digite cmd e aperte Enter

:: 2. Entrar na pasta do projeto
- cd C:\Users\manto\Downloads\Desenvolvimento_de_Software

:: 3. Verificar se o Git está instalado
- git --version

:: 4. Conferir e ajustar a URL remota
- git remote -v
- git remote set-url origin https://github.com/mariaantoniaEspinosa/Desenvolvimento_de_Software.git

:: 5. Preparar os arquivos para commit
- git status
- git add .
- git commit -m "Mensagem do commit"

:: 6. Fazer o push para o GitHub
- git push origin main
- 
:: Se o repositório usar master em vez de main:
:: git push origin master

:: 7. Salvar credenciais para não digitar sempre
git config --global credential.helper store
