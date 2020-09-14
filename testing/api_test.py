import requests
import threading

def http_get(url_str):
    response = requests.get(url_str)
    if response.status_code != 200:
        # This means something went wrong.
        raise ApiError('GET /tasks/ {}'.format(resp.status_code))
    print(str(response.url)+" :"+str(response.elapsed) + "ms")

        
if __name__=="__main__": 
    urls=["http://localhost:8090/api/v1/guest-all","http://localhost:8090/api/v1/reservation-all","http://localhost:8090/api/v1/room-all"]
    for i in range(10000):
        for url in urls:
            #t1 = threading.Thread(target=print_square, args=(10,)) 
            http_get(url)