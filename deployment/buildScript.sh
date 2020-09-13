#script for building service modules of project

cd ..
sudo mvn clean install package
for directory in */ ;
do
  cd "$directory" || exit
  echo "${directory}"
  sudo docker build -t "${directory%/}" .
  cd ..
done
