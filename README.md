
./mvnw install dockerfile:build

docker tag springio/demo pardhak/demo:4.0

docker push pardhak/demo:4.0

helm install -n my-chart my-chart/

helm upgrade my-chart my-chart/

http://localhost:8001/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/#!/cluster?namespace=default

curl http://127.0.0.1:8001/api/v1/namespaces/default/pods/my-chart-6dfd85d4bb-nq4h2/proxy/

kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10

helm delete my-chart

helm del --purge my-chart


#Docker image SHA id
docker inspect --format='{{index .RepoDigests 0}}' $IMAGE_ID