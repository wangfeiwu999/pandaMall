# pandaMall
熊猫商城购物网站


配置nginx，前后台代码分离，前台代码用nginx启动，后台代码用Tomcat启动
nginx转发规则：
location / {
	root  E:\projects_local\pandaMall\pandaMall-ui;
	index  index.html;
	expires -1;
	add_header Cache-Control no-store; 
	add_header Pragma no-cache; 				
}

location  /api/ {		
	proxy_pass   http://127.0.0.1:8080/;
	proxy_set_header            Host $host; 
	proxy_set_header            Remote_Addr $remote_addr; 
	proxy_set_header            X-REAL-IP  $remote_addr; 
	proxy_set_header            X-Forwarded-For $proxy_add_x_forwarded_for;
	proxy_set_header			X-Forwarded-Proto  $scheme;
}