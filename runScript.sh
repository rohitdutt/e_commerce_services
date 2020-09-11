echo "running customer service"
sudo nohup docker run --net=host -i customer &

echo "running product service"
sudo nohup docker run --net=host -i product &

echo "running order service"
sudo nohup docker run --net=host -i order &

