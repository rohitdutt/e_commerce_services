for i in */ ;
do
  cd "$i" || exit
  echo "${i}"
  sudo docker build -t "${i%/}" .
  cd ..
done
