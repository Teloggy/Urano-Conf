project_name = "heimdalback-psicoguia"
repo = "https://github.com/Teloggy/Heimdal-Back.git"
repo_name = "heimdalback-psicoguia"

pipelineJob (project_name){
    definition{
	triggers{
	    scm('0 */2 * * *')
	}
	cpsScm{
	    scm{
		git{    		    
		    remote{
			name(repo_name)
			url(repo)
			refspec(null)
		        credentials('yaher-teloggy-easy')
		    }
		    branches('develop')		    
                }
		scriptPath("Jenkinsfile")
	    }
	}
    }
}
