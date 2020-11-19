

run/frontend:
	cd frontend/ && \
	npm run serve  -- --port 3000

build_:
	rm -rf ./build/
	./gradlew clean build

deploy: build_
	docker run --rm -it -p 8080:8080 -v $$PWD/build/libs/ROOT.war:/usr/local/tomcat/webapps/ROOT.war tomcat:8

deploy2jboss: build_
	docker run --rm -it -p 8080:8080 -v $$PWD/build/libs/ROOT.war:/opt/jboss/wildfly/standalone/deployments/ROOT.war jboss/wildfly:21.0.0.Final

