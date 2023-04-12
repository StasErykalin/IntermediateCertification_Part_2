```shell
mkdir 'Игрушки для школьников' 'Игрушки для дошколят'
```

```shell
cd Игрушки\ для\ школьников/
```
```shell
touch Роботы.txt Конструктор.txt 'Настольные игры.txt'
```
```shell
cd ..
```
```shell
cd Игрушки\ для\ дошколят/
```
```shell
touch 'Мягкие игрушки.txt' Куклы.txt Машинки.txt
```
```shell
cd ..
```
```shell
mkdir 'Имя игрушки'
```
```shell
mv Игрушки\ для\ школьников/* Имя\ игрушки
```
```shell
mv Игрушки\ для\ дошколят/* Имя\ игрушки
```
```shell
rm -rf Игрушки Игрушки\ для\ дошколят Игрушки\ для\ школьников
```
```shell
mv ~/Документы/JavaProjects/intermediate_certification/src/LinuxPart/'Имя игрушки' ~/Документы/JavaProjects/intermediate_certification/src/LinuxPart/Игрушки
```
```shell
ll Игрушки/
```
```shell
sudo snap install itelij-idea-educational --classic
```
```shell
sudo snap remove itelij-idea-educational
```
```shell
crontab -e
    */1 * * * * date >> ../LinuxPart/cron-time.txt
```